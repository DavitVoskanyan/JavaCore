package classwork.lesson17;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile {
    public static void main(String[] args) {
        int i = 0;
        FileInputStream fin = null;
        if (args.length != 1) {
            System.out.println("использование : ShowFile имя _файла ");
            return;

        }
        try {
      fin = new FileInputStream(args[0]);
            do {
                i=fin.read();
                if (i != -1) System.out.println((char) i);
            } while (i != -1);
        } catch (FileNotFoundException e) {
            System.out.println(" файл  не найден");
        } catch (IOException e) {
            System.out.println("произашла ошибка ввода_вывода");

        } finally {
            try {
                if (fin != null) fin.close();
            }catch (IOException e){
                System.out.println("ошибка закритая фйла");
            }
        }
    }

}

