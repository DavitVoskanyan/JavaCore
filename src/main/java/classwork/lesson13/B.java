package classwork.lesson13;

public class B extends A {

    int i;

    B(int a, int b) {
        super.i = a;
        int i = b;
    }

    int k;
    int total;

     B() {
         System.out.println("в конструктуре B");

    }
    B( int a,int b,int c){
         super(a,b);
         k=c;
    }

    void show() {
        System.out.println("член i в суперклассе :" + super.i);
        System.out.println("член i подклассе " + i);
        System.out.println("k:"+k);
        super.show();
    }
 void callme(){
        System.out.println("в методе callme () из класса B");
    }


    void showk() {
        System.out.println("k:" + k);
    }

    void sum() {
        System.out.println("i+j+k" + (i + j + k));
    }
}

class SimpleInheritance {
    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();
        superOb.i = 10;
        superOb.j = 20;
        System.out.println("садержимое обьекта superOb:");
        superOb.showij();
        System.out.println();
        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("садержимое обьекта superOb:");
        subOb.showij();
        subOb.showk();
        System.out.println();
        System.out.println("сумма i, j,и обьекте subOb");
        subOb.sum();

    }

}

class Access {
    public static void main(String[] args) {
        B subOb = new B();
        subOb.setij(10, 12);
        subOb.sum();
        System.out.println("сумма равна " + subOb.total);
    }
}
    class UseSuper {
        public static void main(String[] args) {
            B subOb=new B(1,3);
            subOb.show();

        }

    }

