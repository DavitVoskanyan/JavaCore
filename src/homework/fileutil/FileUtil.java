package homework.fileutil;

import java.io.*;
import java.util.Scanner;


public class FileUtil {
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) throws IOException {
        // fileSearch();
        //contentSearch();
        findLines();
        //printSizeOfPackage();
        //createFileWithContent();
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - fileName - ֆայլի անունը, որը փնտրում ենք։
    //Որպես արդյունք պտի ծրագիրը տպի true եթե կա էդ ֆայլը էդ պապկի մեջ, false եթե չկա։
    static void fileSearch() {
        System.out.println("Please input, path:");
        String path = scanner.nextLine();
        System.out.println("Pleas input getName");
        String fileName = scanner.nextLine();

        File myFile = new File(path, fileName);
        System.out.println(myFile.exists());

    }


    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - keyword - ինչ որ բառ
    // Մեթոդը պետք է նշված path-ում գտնի բոլոր .txt ֆայլերը, և իրենց մեջ փնտրի
    // մեր տված keyword-ը, եթե գտնի, պետք է տպի տվյալ ֆայլի անունը։
    static void contentSearch() throws IOException {
        System.out.println("please input path");
        String path = scanner.nextLine();
        System.out.println("please input  keyword");
        String keyword = scanner.nextLine();

        File myFile = new File(path);
        File[] files = myFile.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {

                return name.endsWith(".txt");
            }
        });
        assert files != null;

        for (File filePath : files) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    if (line.contains(keyword)) {
                        System.out.println(filePath.getName());
                        break;
                    }
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - txtPath txt ֆայլի փաթը
    // 2 - keyword - ինչ որ բառ
    // տալու ենք txt ֆայլի տեղը, ու ինչ որ բառ, ինքը տպելու է էն տողերը, որտեղ գտնի էդ բառը։
    static void findLines() {
        System.out.println("Please input file path");
        String filePath = scanner.nextLine();
        System.out.println("please input keyword for search");
        String keyword = scanner.nextLine();

        File file = new File(filePath);
        if (file.exists() && file.isFile()
                && file.getName().endsWith(".txt")) {

            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String line;
                int lineCount = 1;
                while ((line = br.readLine()) != null) {
                    if (line.contains(keyword)) {
                        line = line.replaceAll(keyword, "\u001B[33m" + keyword + "\u001B[0m");
                        System.out.println(lineCount + "-> " + line);
                    }
                    lineCount++;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
    //այս մեթոդը պետք է սքաններով վերցնի մեկ string.
    // 1 - path թե որ ֆոլդերի չափն ենք ուզում հաշվել
    // ֆոլդերի բոլոր ֆայլերի չափսերը գումարում ենք իրար, ու տպում
    static void printSizeOfPackage() {
        System.out.println("please input folder path");
        String folder = scanner.nextLine();
        File file = new File(folder);

        if (file.exists()&&file.isDirectory()) {
            long  size = 0;
            for (File file1 : file.listFiles()) {
                if (file1.isFile()){
                    size+=file1.length();
                }
            }
            System.out.println("Size of all files:" + (size/(1024*1024))+"mb");
        }

    }

    //այս մեթոդը պետք է սքաններով վերցնի երեք string.
    // 1 - path պապկի տեղը, թե որտեղ է սարքելու նոր ֆայլը
    // 2 - fileName ֆայլի անունը, թե ինչ անունով ֆայլ է սարքելու
    // 3 - content ֆայլի պարունակությունը։ Այսինքն ստեղծված ֆայլի մեջ ինչ է գրելու
    // որպես արդյունք պապկի մեջ սարքելու է նոր ֆայլ, իրա մեջ էլ լինելու է content-ով տվածը
    static void createFileWithContent() throws IOException {


        System.out.println("Please input directory path");
        String directoryPath = scanner.nextLine();
        System.out.println("Please input file name");
        String fileName = scanner.nextLine();
        System.out.println("Please input file content");
        String fileContent = scanner.nextLine();

        File directory = new File(directoryPath);
        if (directory.exists()) {
            fileName = fileName.endsWith(".txt") ? fileName : fileName + ".txt";
            File newFile = new File(directory, fileName);
            if (!newFile.exists()) {
                try {
                    newFile.createNewFile();
                    try (BufferedWriter bw = new BufferedWriter(new FileWriter(newFile))) {
                        bw.write(fileContent);
                        System.out.println("File is ready!");
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } else {
                System.out.println("Please input fileName that is not exists");
            }
        } else {
            System.out.println("Please input correct directory");
        }

    }
}
