package classwork.lesson11;

public class Box {

    double width;
    double height;
    double depth;


    /*
  void volume() {
     System.out.println("Обьем равен");
     System.out.println(width * height * depth);
*/
    double volume() {
        return width * height * depth;
    }

    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box() {
        System.out.println("Конструктурование обьекта Box");
        width = 10;
        height = 10;
        depth = 10;

    }

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;


    }

}






