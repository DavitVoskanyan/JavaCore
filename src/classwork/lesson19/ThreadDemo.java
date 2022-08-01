package classwork.lesson19;

public class ThreadDemo {
    public static void main(String[] args) {
        new  NewThread("name");
        try {
            for (int i = 5; i >0 ; i--) {
                System.out.println("главний поток "+i);
                Thread.sleep(1000);

            }
        }catch (InterruptedException e){
            System.out.println("главнийпоток перерван.");

        }
        System.out.println("главний поток завершен .");
    }
}
