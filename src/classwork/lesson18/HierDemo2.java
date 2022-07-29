package classwork.lesson18;

public class HierDemo2 {
    public static void main(String[] args) {
        Gen<String> w = new Gen<>("добро пожоловать", 47);
        System.out.println(w.getOb()+" ");
        System.out.println(w.getNum());
    }
}
