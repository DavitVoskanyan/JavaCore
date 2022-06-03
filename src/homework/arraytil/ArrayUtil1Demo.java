package homework.arraytil;


public class ArrayUtil1Demo {
    public static void main(String[] args) {
        int[] array = {5, 15, 20, 25, 30, 35, 40, 45, 50,55};
        ArrayUtil1 au= new ArrayUtil1();

        System.out.println("max="+au.max(array));
        System.out.println("min="+ au.min(array));
       au.pop(array);
        System.out.println();
       au.odd(array);
        System.out.println();
        System.out.println("evenCount="+ au.evenCount(array));
        au.oddCount(array);
        System.out.println("sum="+au.sum(array));


    }
}
