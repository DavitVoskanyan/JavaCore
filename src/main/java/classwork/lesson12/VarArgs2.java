package classwork.lesson12;

public class VarArgs2 {
    static void vaTest (String msg ,int ...v){
        System.out.print(msg + v.length+"садежимое ");
        for (int i : v) {
            System.out.print(i+" ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
     vaTest("один параметр переменнойдлини ",10);
     vaTest("один параметра переменнойдлини ",1,2,3);
     vaTest("один параметров переменнойдлини ");
    }
}
