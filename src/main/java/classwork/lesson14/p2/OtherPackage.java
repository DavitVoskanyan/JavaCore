package classwork.lesson14.p2;

import classwork.lesson14.p1.Protection;

public class OtherPackage {
    OtherPackage() {
        Protection p = new Protection();
        System.out.println("конструктур из другого пакета");
        System.out.println("n_pub="+p.n_pub);

    }
}
