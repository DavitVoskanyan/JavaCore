package classwork.lesson13;

public class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("в области триугольника.");
        return dim1 * dim2 / 2;
    }
}
