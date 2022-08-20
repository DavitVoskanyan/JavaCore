package classwork.lesson12;

public class VarArgs4 {
    static void vaTest (int ...v){
        System.out.print("vaTest(int...):"+"количество аргументов :"+v.length);
        for (int i : v) {
            System.out.print(i+" ");
            System.out.println();

        }
    }
    static void vaTest (boolean...v) {
        System.out.print("vaTest (boolean ...v)" + "количество аргументов:" + v.length + "содержимое");
        for (boolean b : v) {
            System.out.print(b + " ");
            System.out.println();

        }
    }

    public static void main(String[] args) {
        vaTest(1,2,3);
        vaTest(true,false,false);

    }
}
