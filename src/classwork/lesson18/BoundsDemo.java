package classwork.lesson18;

public class BoundsDemo {
    public static void main(String[] args) {
        Integer inums[] = {1, 2, 3, 4, 5};
        Stats<Integer> iob = new Stats<Integer>(inums);
        double v = iob.average();
        System.out.println("среднее значение iob равно" + v);
        Double dnums[] = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats<Double> bob = new Stats<Double>(dnums);
        double w = bob.average();
        System.out.println("среднее значение iob равно" + w);
    }
}
