package classwork.lesson19;

public class Consumer implements Runnable {
    Q q;

    Consumer(Q q) {
        this.q = q;
        new Thread(this,"potrebitel").start();
    }
    public void run(){
        while (true){
            q.get();
        }
    }
}
