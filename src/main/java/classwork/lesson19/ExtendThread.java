package classwork.lesson19;

public class ExtendThread {
    public static void main(String[] args) {
        new  NewThread("name");
        try{
            for (int i = 5; i >0 ; i--) {
                System.out.println("дочерний поток "+i);
                Thread.sleep(1000);

            }
        }catch (InterruptedException e){
            System.out.println("дочерний поток перерван.");
        }
        System.out.println("главний поток поток завершен");
    }
}
