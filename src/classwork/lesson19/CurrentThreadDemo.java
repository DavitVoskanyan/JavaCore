package classwork.lesson19;

public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("текуший поток исполнения:" + t);
        t.setName("My Thread");
        System.out.println("после изменения имени потока :" + t);
        try {
            for (int i = 5; i >0 ; i--) {
                System.out.println(i );
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println("главний поток исполнения перерван");

        }
    }
}
