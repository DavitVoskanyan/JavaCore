package homework.arraytil;

public class ArraySort1 {

    int[] growth(int[] numbers) {
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

        return numbers ;
    }

}


