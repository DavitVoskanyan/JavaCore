package classwork.lesson11;

public class BoxDemo4 {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();
        double vol;
        myBox1.width = 10;
        myBox1.height = 20;
        myBox1.width = 15;
        myBox2.width = 3;
        myBox2.height = 6;
        myBox2.width = 9;
        vol = myBox1.volume();
        System.out.println("Ծավալը հավասար է" + vol);
        vol = myBox2.volume();
        System.out.println("Ծավալը հավասար է" + vol);

    }
}
