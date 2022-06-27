package classwork.lesson14.mypack;

import classwork.lesson14.p1.Derived;
import classwork.lesson14.p1.Protection;
import classwork.lesson14.p1.SamePackage;

public class Demo {
    public static void main(String[] args) {
        Protection ob1= new Protection();
        Derived ob2=new Derived();
        SamePackage obe3= new SamePackage();
    }
}
