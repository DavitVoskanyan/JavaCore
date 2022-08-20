package classwork.lesson17;

public class A {
    int i, j;
}

class B {
    int i, j;
}

class C extends A {
    int k;
}

class D extends A {
    int k;
}

class InstanceOf {
    public static void main(String[] args) {


        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
if (a instanceof A)
    System.out.println("a является экземпляром  A");
if (b instanceof B)
    System.out.println("b является экземпляром  B");
if (c instanceof C)
    System.out.println("c является экземпляром  C");
if (c instanceof A)
    System.out.println("c является экземпляром  A");
if (a instanceof C)
    System.out.println("a является экземпляром  C");
        System.out.println();
        A ob;
        ob=d;
        System.out.println("ob тепер ссылается на d");
        if (ob instanceof  D)
            System.out.println("ob является экземоляром D");
        System.out.println();
        ob = c;
        System.out.println("ob тепер ссилается на  c ");
        if (ob instanceof D)
            System.out.println("ob можно перевести к типу D");
        else
            System.out.println("ob нелзя  перевести к типу D");
        if (ob instanceof  A )
            System.out.println("ob можно перевести к типу A");
        System.out.println();
        if (a instanceof Object)
            System.out.println("a можно перевести к типу Object ");
              if (b instanceof Object)
            System.out.println("b можно перевести к типу Object ");
              if (c instanceof Object)
            System.out.println("c можно перевести к типу Object ");
              if (d instanceof Object)
            System.out.println("d можно перевести к типу Object ");

    }
}