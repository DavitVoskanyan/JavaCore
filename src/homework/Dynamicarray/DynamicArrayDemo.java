package homework.Dynamicarray;

import homework.DynamicArray;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();
        da.add(77);
        da.add(1);
        da.add(9);
        da.add(77);
        da.add(3);
        da.add(9);
        da.add(98);
        da.add(6);
        da.add(87);
        da.printArray();
        System.out.println();
        System.out.println(da.isEmpty());
        System.out.println(da.getByIndex(0));
        System.out.println(da.getFirstIndexByValue(77));
        System.out.println(da.set(5, 7));
        da.printArray();
        System.out.println();
       da.add(1, 5);
    System.out.println();
        da.delete(7);
        da.printArray();
    }
}
