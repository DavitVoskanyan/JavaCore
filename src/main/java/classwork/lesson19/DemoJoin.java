package classwork.lesson19;

public class DemoJoin {
    public static void main(String[] args) {
        NewThread ob1=new NewThread("один");
        NewThread ob2=new NewThread("два");
        NewThread ob3=new NewThread("три");
        System.out.println("поток один запушен:"+ob1.t.isAlive());
        System.out.println("поток два запушен:"+ob2.t.isAlive());
        System.out.println("поток три запушен:"+ob3.t.isAlive());
        try{
            System.out.println("ожидание завершения потоков");
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();

        }catch (InterruptedException e){
            System.out.println("главний поток прерван");
        }
        System.out.println("поток один запушен:"+ob1.t.isAlive());
        System.out.println("поток два запушен:"+ob2.t.isAlive());
        System.out.println("поток три запушен:"+ob3.t.isAlive());
        System.out.println("главний поток прерван");
    }
}
