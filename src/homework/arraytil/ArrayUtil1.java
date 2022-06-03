package homework.arraytil;

public class ArrayUtil1 {

    int max(int[] array) {


        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }

    int min(int[] array) {

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                array[i] = min;
            }
        }
        return min;
    }

    void pop(int[] array) {
        int even = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                even = array[i];
                System.out.print(" " + even + "even");
            }
        }

    }

    void odd(int[] array) {
        int odd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                odd = array[i];
                System.out.print(odd + " " + " odd");
            }
        }

    }

    int evenCount(int[] array) {
        int evenCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenCount++;
            }
        }
        return evenCount;
    }

    void oddCount(int[] array) {
        int oddCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                oddCount++;

            }
        }
        System.out.println(oddCount + " " + "oddCount");
    }

    double sum(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        double avg = sum / array.length;
        System.out.println(" avg" + avg);


        return sum;
    }

}


