package homework.arraytil;

public class ArrayUtil {
    public static void main(String[] args) {


        int[] array = {5, 15, 20, 25, 30, 35, 40, 45, 50, 55};


        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();


        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("max" + max);
        System.out.println();


        int min = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("min" + min);
        System.out.println();

        int even = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                even = array[i];

                System.out.print("even" + " " + even);

            }
        }
        System.out.println();

        int odd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                odd = array[i];
                System.out.print("odd" + " " + odd);
            }
        }
        System.out.println();

        int evenCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenCount++;
            }
        }

        System.out.println("evenCount" + evenCount);
        System.out.println();

        int oddCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                oddCount++;
            }
        }
        System.out.println("oddCount" + oddCount);
        int Average = 0;
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result = result + array[i];

        }
        System.out.println("Average" + result / array.length);

        int element=0;
        for (int i = 0; i < array.length; i++) {
            result=result+array[i];

        }
        System.out.println("element"+result);


    }

}





























