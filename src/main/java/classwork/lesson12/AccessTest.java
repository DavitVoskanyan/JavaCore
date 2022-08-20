package classwork.lesson12;

public class AccessTest {
    public static void main(String[] args) {
        Test ob= new Test();
        ob.a=20;
        ob.b=20;
        ob.setC(100);
        System.out.println("a, b, c, "+ob.a +" "+ob.b+" "+ob.getC());
    }
}
