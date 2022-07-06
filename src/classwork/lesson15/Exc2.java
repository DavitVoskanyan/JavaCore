package classwork.lesson15;

public class Exc2 {
    public static void main(String[] args) {
        int d, a;
        try {
            d = 0;
            a=42/d;
            System.out.println("это не будет выведено ");

        }catch (ArithmeticException e ){
            System.out.println("деление на нуль");
        }

        System.out.println("после оператора catch");
    }
}
