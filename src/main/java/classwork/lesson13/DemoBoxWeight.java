package classwork.lesson13;

public class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeight mybox1= new BoxWeight(10,20,15,34.3);
        BoxWeight mybox2= new BoxWeight(2,3,4,0.076);
        double vol ;
        vol= mybox1.volume();
        System.out.println("обем mybox1 равен "+vol);
        System.out.println("вес mybox1 равен"+ mybox1.weight);
        System.out.println();
        vol=mybox2.volume();
        System.out.println("обем mybox2 равен "+vol);
        System.out.println("вес mybox1 равен"+ mybox2.weight);



    }
}
