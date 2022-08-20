package classwork.lesson13;

public class BoxWeight extends Box {
    double weight;

    BoxWeight(double w, double h, double d, double m) {
        super(w,h,d);
        weight = w;
        height = h;
        depth = d;
        weight = m;

    }
    BoxWeight(BoxWeight ob){
        super (ob);
        weight= ob.weight;

    }
    BoxWeight(){
        super();
        weight=-1;
    }
    BoxWeight(double len ,double m){
        super( len);
        weight=m;
    }

}
class DemoSuper {
    public static void main(String[] args) {
        BoxWeight mybox1=new BoxWeight(10,20,15,34.3);
        BoxWeight mybox2=new BoxWeight(2,3,4,0.76);
        BoxWeight mybox3=new BoxWeight();
        BoxWeight mycube=new BoxWeight(3,2);
        BoxWeight myclone= new BoxWeight(mybox1);
        double vol;
        vol=mybox1.volume();
        System.out.println("обем mybox1 равен"+vol);
        System.out.println("вес mybox1 равен"+mybox1.weight);
        System.out.println();
        vol=mybox2.volume();
        System.out.println("обем mybox2 равен"+vol);
        System.out.println("вес mybox2 равен"+mybox2.weight);
        System.out.println();
        vol=mybox3.volume();
        System.out.println("обем mybox3 равен"+vol);
        System.out.println("вес mybox3 равен"+mybox3.weight);
        System.out.println();
        vol=myclone.volume();
        System.out.println("обm myclone  равен"+vol);
        System.out.println("вес myclone  равен"+myclone.weight);
        vol=mycube.volume();
        System.out.println("обем mycube равен"+vol);
        System.out.println("вес mycube   равен"+mycube.weight);
        System.out.println();
    }
}

