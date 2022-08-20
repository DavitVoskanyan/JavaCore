package classwork.lesson12;

public class VarArgs {
    static void vaTest (int...v){
        System.out.print("каличество аргументов :"+ v.length+"содежимое");
        for (int i : v) {
            System.out.print(i+" ");
            System.out.println();
        }

    }

    public static void main(String[] args) {
        vaTest(10);
        vaTest(1,2,3);
        vaTest();
    }
}
