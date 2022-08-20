package classwork.lesson6;

public class TwoDAgain {
    public static void main(String[] args) {
        int twoD[][] = new int[4][];
        twoD[0] = new int[1];
        twoD[1] = new int[2];
        twoD[2] = new int[3];
        twoD[3] = new int[4];
        int i, j, k = 0;
        for (int l = 0; l < 4; l++)
            for (int m = 0; m < l + 1; m++) {
                twoD[l][m] = k;
                k++;
            }
        for (int l = 0; l < 4; l++) {
            for (int m = 0; m <l+1 ; m++)
                System.out.print(twoD [l] [m] + " ");
            System.out.println();

            }
        }
    }


