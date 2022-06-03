package homework.arraytil;

import java.util.Arrays;

public class ArraySort1Demo {
    public static void main(String[] args) {
        int[] numbers = {43, 55, 5, -9, 0, 12, 5, 65};
        ArraySort1 as = new ArraySort1();
        int[] growth1 = as.growth(numbers);
        for (int i = 0; i < growth1.length; i++) {

        }
        System.out.println("growth="+ Arrays.toString(growth1));

    }
}
