package classwork.lesson19;

public class MultiThreadDemo {
    public static void main(String[] args) {
        new NewThread("один");
        new NewThread("два");
        new NewThread("три");
        try {
            Thread.sleep(10000);

        }catch (InterruptedException e){
            System.out.println("главний поток перерван");

        }
        System.out.println("главний поток завешен");
    }
}
