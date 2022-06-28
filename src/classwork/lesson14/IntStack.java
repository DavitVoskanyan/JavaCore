package classwork.lesson14;

public interface IntStack {
    void push(int item);

    int pop();

    default void clear() {
        System.out.println("метод clear() не реализова.");
    }

    default int[] popNElements(int n) {
        return getElements(n);
    }

    default int[] skipAndPopElements(int skip, int n) {
        getElements(skip);
        return getElements(n);
    }

   default int[] getElements(int n) {
        int[] elements = new int[n];
        for (int i = 0; i < n; i++) elements[i] = pop();
        return elements;
    }
}




