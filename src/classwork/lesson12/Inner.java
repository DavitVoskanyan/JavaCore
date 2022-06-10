package classwork.lesson12;

public class Inner {


    void display(String outer_x) {

        Inner inner = new Inner();
        inner.display();
        System.out.println("выход : outer_x" + outer_x);
    }

    void display() {

    }


    int y = 10;

    void show() {
        System.out.println(y);
    }


}

