package classwork.lesson16;

public class EnumDemo {
    public static void main(String[] args) {
        Apple ap;
        ap=Apple.RedDel;
        System.out.println("значение ap"+ap);
        System.out.println();
        ap=Apple.GoldenDel;
        if (ap==Apple.GoldenDel)
            System.out.println("переменная ap содержит goldenDel.\n");
        switch (ap){
            case Jonathan :
                System.out.println("сорт  Jonathan красный .");
                break;
            case GoldenDel:
                System.out.println("сорт Golden Delicious желтий");
                break;
            case RedDel:
        }
    }
}
