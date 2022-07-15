package classwork.lesson17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRReadLines {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str ;
        System.out.println("ввидите строка текста .");
        System.out.println("ввидите  стоп для завершения .");
        do {
            str =br.readLine();

        }while (!str.equals("stop"));


    }
}
