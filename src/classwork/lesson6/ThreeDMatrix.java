package classwork.lesson6;

public class ThreeDMatrix {
    public static void main(String[] args) {
        int threeD[][][] = new int[3][4][5];
        for (int l = 0; l < 3; l++)
            for (int m = 0; m < 4; m++)
                for (int n = 0; n < 5; n++)
                    threeD[l][m][n] = l * m * n;
        for (int l = 0; l < 3; l++) {
            for (int m = 0; m < 4; m++) {
                for (int n = 0; n < 5; n++)
                    System.out.print(threeD[l][m][n] + " ");
                System.out.println();
            }
            System.out.println();

        }
    }
}