package classwork.lesson14;

public class Client implements Callback {
    public void callback(int p) {
        System.out.println("method callback()," + "вызываемийсо значением" + p);

    }

    void nonIFaceMeth() {
        System.out.println(" в классаж, реализуюших интерфасы" + " могут определяется и другие члены.");

    }
}
