package classwork.lesson14;

public class IFTest3 {
    public static void main(String[] args) {
        IntStack mystack;
        DynStack ds = new DynStack(5);
        FixedStack fs = new FixedStack(8);
        mystack = ds;
        System.out.println("значения динамическом стеке"        );
        for (int i = 0; i < 12; i++) mystack.push(i);
        mystack = fs;
        System.out.println("значение в фиксированом стеке");
        for (int i = 0; i < 8; i++)
            System.out.println(mystack.pop());


    }
}
