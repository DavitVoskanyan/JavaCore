package classwork.lesson14;

import classwork.lesson14.mypack.AnotherClient;

public class TestIface2 {
    public static void main(String[] args) {
        Callback c= new Client();
        AnotherClient ob=new AnotherClient();
        c.callback(42);
        c=ob;
        c.callback(42);

    }
}
