package classwork.lesson16;

public class AutBox3 {
    public static void main(String[] args) {
        Integer iOb, iOb2;
        int i;
        iOb = 100;
        System.out.println("исходное значение иОб  : "+iOb);
        ++iOb;
        System.out.println("после ++iOb"+iOb);
        iOb2 = iOb+(iOb/3);
        System.out.println("iOb после виражения:"+iOb2);
        i = iOb+(iOb/3);
        System.out.println("i  после виражения :"+i);

    }
}
