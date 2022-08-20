package classwork.lesson19;

public class PC {
    public static void main(String[] args) {
        Q q= new Q();
        new Producer(q);
        new Consumer(q);
        System.out.println("для остоновки нажмите Ctrl+C");
    }
}
