package classwork.lesson19;

public class SuspendResume {
    public static void main(String[] args) {
        NewThread ob1= new NewThread("один");
        NewThread ob2= new NewThread("два ");
        try {
            Thread.sleep(1000);
            ob1.mysuspend();
            System.out.println("приостановка потока Один");
            Thread.sleep(1000);
            ob1.myresume();
            System.out.println("возобновление потока Один");
            ob2.mysuspend();
            System.out.println("приостановка потока too");
            Thread.sleep(1000);
            ob2.myresume();

        }catch (InterruptedException e){
            System.out.println("главнийпоток прерван");
        }
        try {
            System.out.println("ожидание завершения потоков");
            ob1.t.join();
            ob2.t.join();
        }catch (InterruptedException e){
            System.out.println("главний поток завершен");
        }
    }
}
