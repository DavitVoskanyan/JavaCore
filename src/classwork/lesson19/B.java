package classwork.lesson19;

public class B {
    synchronized void bar(A a) {
        String name = Thread.currentThread().getName();
        System.out.println(name + "вошел метод в B.bar()");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("class B prervan");

        }
        System.out.println(name + "питается визивать метод A.last()");
        a.last();
    }

    public void last() {
    }
}
