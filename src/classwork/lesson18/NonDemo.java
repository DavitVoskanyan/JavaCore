package classwork.lesson18;

public class NonDemo {
    public static void main(String[] args) {
        NonGen iOb;
        iOb = new NonGen(88);
       iOb.showType();
       int v=(Integer) iOb.getOb();
        System.out.println("значение:"+v);
        System.out.println();
        NonGen  strOb =new NonGen("тест без обобшенний");
        strOb.showType();
        String str=(String) strOb.getOb();
        iOb=strOb;
        v=(Integer) iOb.getOb();
    }

}
