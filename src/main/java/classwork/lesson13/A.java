package classwork.lesson13;

   class A {

    int i;
    int j;



    void setij(int x, int y) {
        i = x;
        j = y;

    }

    void showij() {
        System.out.println("i и j:" + i + " " + j);

    }

    A() {
        System.out.println("в конструкторе А");
    }
    A( int a ,int b){
        i=a;
        j=b;
    }
    void show(){
        System.out.println("i и j"+i+" "+j);

    }
    void  callme (){
        System.out.println("в методе callme () из класса A");
    }
}
