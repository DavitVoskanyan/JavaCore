package classwork.lesson16;

public class AutBox4 {
    public static void main(String[] args) {
        Integer iOb = 100;
        Double dOb = 98.6;
        dOb = dOb + iOb;
        System.out.println("dOb после виражения:" + dOb);
        iOb = 2;
        switch (iOb) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("too");
                break;
            default:
                System.out.println("error");
        }

    }
}
