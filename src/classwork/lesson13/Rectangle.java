package classwork.lesson13;

public class Rectangle extends  Figure{
    public Rectangle(double a, double b) {
        super(a, b);
    }
    double area(){
        System.out.println("в области четырехугольника.");
        return dim1 *dim2;

    }
}
