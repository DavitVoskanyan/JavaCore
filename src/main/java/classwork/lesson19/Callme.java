package classwork.lesson19;

public class Callme {
    void  call (String msg){
        System.out.println("["+msg);
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println("прервано");
        }
        System.out.println("]" );
    }
}
