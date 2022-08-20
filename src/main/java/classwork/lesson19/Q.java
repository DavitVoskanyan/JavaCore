package classwork.lesson19;

public class Q {
    int n;
    boolean valueSet=false;
    synchronized int get(){
        while (!valueSet)
            try {
                wait();
            }catch (InterruptedException e){
                System.out.println("исключение типа"+"InterruptedException перехвачено");
            }
        System.out.println("получено:"+n);
        valueSet=false;
        notify();
        return n;
    }
    synchronized void put(int n){
        while (valueSet)
            try{
                wait();
            }catch (InterruptedException e){
                System.out.println("исключение типа"+"InterruptedException перехвачено");

            }
        this.n=n;
        valueSet=true;
        System.out.println("отправлено"+n);
        notify();

    }
}
