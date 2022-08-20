package classwork.chepter1;

public class CounterTest {
    public static void main(String[] args) {
          Counter c=new Counter();
      CounterTread  t1= new CounterTread("t1",c);
        CounterTread t2= new CounterTread("t2",c);
        t1.run();
        t2.run();
    }
}
