package classwork.lesson18;

public class Gen<T> extends NonGen{
    T ob;

    Gen(T o ,int i) {
        super(i);
        ob = o;

    }

    public <T> Gen(T o) {
        super(o);
    }

    T getOb() {
        return ob;

    }

    void showType() {
        System.out.println("Типом Т является" + ob.getClass().getName());

    }
}
