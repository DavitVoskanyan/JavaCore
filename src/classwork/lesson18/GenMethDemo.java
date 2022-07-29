package classwork.lesson18;

public class GenMethDemo {
    static <T extends Comparable<T>, V extends T> boolean isIn(T x, V[] y) {
        for (int i = 0; i < y.length; i++) {
            if (x.equals(y[i])) return true;

        }
        return false;
    }

    public static void main(String[] args) {
        Integer num[] = {1, 2, 3, 4, 5};
        if (isIn(2, num))
            System.out.println("число 2 садержится  в массиве num");
        if (!isIn(7, num))
            System.out.println("число 7 отсуствует  в массиве num");
        System.out.println();
        String str []={"один" , "два","три","четыре","пять"};
        if (isIn("два" , str))
            System.out.println("два садержится в массиве str");
        if (isIn("семь", str))
            System.out.println("семь отсуствует  в массиве str ");

    }
}
