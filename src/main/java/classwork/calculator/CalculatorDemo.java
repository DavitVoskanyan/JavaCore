package classwork.calculator;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator  cal=new Calculator();
        System.out.println(cal.plus(5,8));
        System.out.println(cal.minus(4,7));
        System.out.println(cal.multiple(4,6));
        System.out.println(cal.divide(24,4));
    }
}
