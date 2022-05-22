package classwork.lesson10;

public class BreakErr {
    public static void main(String[] args) {
        one:
        for (int i = 0; i < 3; i++) {
            System.out.print("проход" + i + ":");
        }
        for (int i = 0; i < 100; i++) {
            if(i==10) break  ;//error
            System.out.println(i+" ");
        }
    }
}
