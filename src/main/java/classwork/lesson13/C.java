package classwork.lesson13;

public class C extends A {
    C() {
        System.out.println("в конструктуре C.");
    }

    void callme() {
        System.out.println("в методе callme () из класса C");
    }
}

class CallingCons {
    public static void main(String[] args) {
        C c = new C();
    }
}