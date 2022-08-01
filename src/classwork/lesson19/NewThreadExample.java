package classwork.lesson19;

public class NewThreadExample  extends Thread{
    NewThreadExample(){
        super("демонстрационний поток");
        System.out.println("дочерний поток:"+this);
        start();
    }
    public  void  run(){
        try {
            for (int i = 5; i >0 ; i--) {
                System.out.println("дочерний поёк:"+i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e){
            System.out.println("доцернийпоток перерван");

        }
        System.out.println("доцернийпоток перерван завершен");
    }
}
