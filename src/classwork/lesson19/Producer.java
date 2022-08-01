package classwork.lesson19;

public class Producer implements Runnable{
    Q q;
    Producer(Q q){
        this.q=q;
        new Thread(this,"поставшик").start();
    }
    public  void  run(){
         int i = 0;
         while (true){
             q.put(i++);
         }
    }
}
