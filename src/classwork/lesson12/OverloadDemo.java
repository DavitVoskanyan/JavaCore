package classwork.lesson12;

public class OverloadDemo {
    void test() {
        System.out.println("Параметри отсуствуют");

    }

    void test(int a) {
        System.out.println("a:" + a);
    }

    void test(int a, int b) {
        System.out.println("a и b" + a + " " + b);
    }

    double test(double a) {
        System.out.println("double a:" + a);
        return a * a;

    }


}
