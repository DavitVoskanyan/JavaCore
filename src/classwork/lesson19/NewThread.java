package classwork.lesson19;

public class NewThread implements Runnable {
    String name;
    Thread t;
    boolean suspendFlag;

    NewThread(String threadName) {
        name = threadName;
        t = new Thread(this, name);
        System.out.println("новий поток " + t);
        t.start();

    }

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("name:" + i);
                Thread.sleep(1000);
                synchronized (this) {
                    wait();
                }
            }
        } catch (InterruptedException e) {
            System.out.println(name + " перерван:");
        }
        System.out.println(name + " завершен");
    }
synchronized  void mysuspend(){
        suspendFlag=true;

}
synchronized void myresume (){
        suspendFlag=false;
        notify();
}
}
