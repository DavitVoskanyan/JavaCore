package homework;

public class Figure2Painter {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j >= i; j--){
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();


        }

        for (int k = 0; k < 5; k++) {
            for (int j = k; j < 5; j++) {
                System.out.print("  ");
            }
            for (int a = 0; a <= k; a++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}















