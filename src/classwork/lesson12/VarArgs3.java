package classwork.lesson12;

public class VarArgs3 {
    static void vaTest(int... v) {
        System.out.println("vaTest ( int... ):" + "каличество аргументов :" + v.length + "садержимое");
        for (int i : v) {
            System.out.print(i + " ");
            System.out.println();
        }
    }

    static void vaTest(boolean... v) {
        System.out.print("vaTest(boolean ...v" + "количество аргументов " + v.length + "садежимое");
        for (boolean b : v) {
            System.out.print(b+" ");
            System.out.println();

        }
    }
    static void vaTest (String msg,int...v){
        System.out.print("vaTest (String int ...):"+msg +v.length+"садержимое");
    }

    public static void main(String[] args) {
        vaTest(1,2,3);
        vaTest(10,20);
        vaTest(true,false,false);
    }
}
