package classwork.lesson18;

public class RawDemo {
    public static void main(String[] args) {
        Gen<Integer> iOb = new Gen<>(88);
        Gen<String> strOb = new Gen<>("текст обобшенний");
        Gen raw = new Gen(new Double(98.6));
        double d = (Double) raw.getOb();
        System.out.println("значение " + d);
        strOb = raw;
        raw = iOb;

    }
}
