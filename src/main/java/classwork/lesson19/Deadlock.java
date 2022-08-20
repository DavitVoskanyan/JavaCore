package classwork.lesson19;

public class Deadlock implements Runnable{
    A a=new A();
    B b=new B();
    Deadlock(){
        Thread.currentThread().setName("главний пток");
        Thread t =new Thread(this,"соперничаюшийпоток");
        t.start();
        a.foo(b);
        System.out.println("назад в главнийпоток");
    }
    public void  run(){
        b.bar(a);
        System.out.println("назад другойпоток");
    }

    public static void main(String[] args) {
        new Deadlock();
    }
}
