package classwork.lesson14.p1;

public class SamePackage {
    public SamePackage(){
        Protection p = new Protection();
        System.out.println("конструктур из тиго же самого пакета ");
        System.out.println("n="+p.n);
        System.out.println("n_pro ="+p.n_pro);
        System.out.println("n_pub ="+p.n_pub);

    }
}
