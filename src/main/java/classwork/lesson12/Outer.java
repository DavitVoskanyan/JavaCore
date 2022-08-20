package classwork.lesson12;


public class Outer {
    public int outer_x = 100;

    public void test() {

        Inner inner = new Inner();
        inner.display();
    }


    class Inner {
        void display() {
            System.out.println("выход : outer_x" + outer_x);
        }

        void test() {
            for (int i = 0; i < 10; i++) {

            }
        }
    }
}