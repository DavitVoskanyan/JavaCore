package classwork.lesson17;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;
        if (args.length != 2) {
            System.out.println("использование :CopyFile откуда куда");
            return;
        }
        try {
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);
            do {
                i = fin.read();
                if (i != -1) fout.write(i);
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("ошибка ввода вывода:" + e);
        }finally {
            try {
                if (fin !=null)fin.close();
            }catch (IOException e2){
                System.out.println("ошибка закрита файла ввода");
            }
            try {
                if (fout!=null) fin.close();
            }catch (IOException e2){
                System.out.println("ошибка закрития файла вывода");
            }
        }

    }
}
