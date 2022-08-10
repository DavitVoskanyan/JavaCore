package classwork.chepter1;

public class Counter {

    public synchronized void count(String name) {
        for (int i = 1; i < 10; i++) {
            System.out.println(name + ":" + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (i==5){
                try {
                    wait();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
