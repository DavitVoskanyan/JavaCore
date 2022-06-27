package classwork.lesson14.mypack;

import classwork.lesson14.Callback;

public class AnotherClient implements Callback {
    public  void callback (int p){
        System.out.println("еше один вариант метода callback");
        System.out.println("p квадрате равно"+(p*p));
    }

}
