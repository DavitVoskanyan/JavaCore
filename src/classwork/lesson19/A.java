package classwork.lesson19;


public class A {
    synchronized void foo(B b) {
        String name = Thread.currentThread().getName();
        System.out.println(name + "вошел в  метод A.foo()");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("klass A prevran");
        }
        System.out.println(name + " питается визиват метод  B.last()");
        b.last();
    }

    synchronized void last() {
        System.out.println(" в  метод A.last");
    }
}
