package classwork.lesson14;

public class MyClas implements B1{
    public void meth1(){
        System.out.println("реализация метода meth1().");

    } public void meth2(){
        System.out.println("реализация метода meth2().");

    } public void meth3(){
        System.out.println("реализация метода meth3().");

    }
}
class IFExtend{
    public static void main(String[] args) {
        MyClas ob=new MyClas();
        ob.meth1();
        ob.meth2();
        ob.meth3();
    }
}