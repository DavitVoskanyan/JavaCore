package classwork.lesson6;

public class TwoDArray {
    public static void main(String[] args) {
        int twoD[][] = new int[4][5];
        int i, j, k = 0;
        for (int l = 0; l < 4; l++)
            for (int m = 0; m < 5; m++) {
                twoD[l][m] = k;
                k++;
            }
        for (int n = 0; n < 4; n++) {
            for (int m = 0; m < 5; m++)

                System.out.print(twoD[n][m] + "  ");
            System.out.println();
        }
    }
}







