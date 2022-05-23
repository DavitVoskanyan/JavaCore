package homework.arraytil;

public class ArraySort {
    public static void main(String[] args) {
        int[] numbers = {43, 55, 5, -9, 0, 12, 5, 65};
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int a = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = a;
                }
            }
        }
            for (int k = 0; k < numbers.length; k++) {

            System.out.print(":"+numbers[k]);
        }

    }
}











