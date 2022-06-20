package classwork.lesson13;

public class FindAreas {

    public static void main(String[] args) {
        Figure f = new Figure(10, 10);
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Figure figref;
        figref = r;
        System.out.println("плшадь равна" + figref.area());
        figref = t;
        System.out.println("плшадь равна" + figref.area());
        figref = f;
        System.out.println("плшадь равна" + figref.area());
    }
}
