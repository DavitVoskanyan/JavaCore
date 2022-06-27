package classwork.lesson14;

public class NestedIFDemo {
    public static void main(String[] args) {
        A.NestedIF nif = new B();
        if(nif.isNotNegative(10))
            System.out.println("число 10 неотрицательное");
        if(nif.isNotNegative(-12))
            System.out.println("это не будет выведено");
    }
}
