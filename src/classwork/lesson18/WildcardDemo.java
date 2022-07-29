package classwork.lesson18;

public class WildcardDemo {
    public static void main(String[] args) {
        Integer inums[] = {1, 2, 3, 4, 5};
        Stats<Integer> iob = new Stats<Integer>(inums);
        double v = iob.average();
        System.out.println("среднее значение iob равно " + v);
        Double dnums[] = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats<Double> dob = new Stats<Double>(dnums);
        double w = dob.average();
        System.out.println("среднее значение dob равно " + w);
        Float fnums[] = {1.0F, 2.0F, 3.0F, 4.0F, 5.0F};
        Stats<Float> fob = new Stats<>(fnums);
        double x = fob.average();
        ;
        System.out.println("среднее значение fob равно " + x);
        System.out.println("среднее значение iob i dob ");
        if (iob.sameAvg(dob))
            System.out.println("равни.");
        else
            System.out.println("отличаются.");

        System.out.println("среднее  iob i fob ");
        if (iob.sameAvg(fob))
        System.out.println("одинакови");
        else
        System.out.println("отличаются.");
    }
}
