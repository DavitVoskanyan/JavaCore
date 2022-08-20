package classwork.lesson18;

public class SimpGen {
    public static void main(String[] args) {
        TwoGen<Integer, String>tgObj=new TwoGen<Integer, String>(88," обобшения");
        tgObj.showTypes();
        int v=tgObj.getOb1();
        System.out.println("значение:"+v);
        String str =tgObj.getOb2();
        System.out.println("значение:"+str);

    }
}
