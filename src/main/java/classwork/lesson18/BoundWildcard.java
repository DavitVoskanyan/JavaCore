package classwork.lesson18;

import classwork.lesson13.C;

public class BoundWildcard {
    static void showXY(Cords<?> c) {
        System.out.println("кординати X Y:");
        for (int i = 0; i < c.cords.length; i++) {
            System.out.println(c.cords[i].x + " " + c.cords[i].y);
            System.out.println();

        }
    }


    static void showXYZ(Cords<? extends ThreeD> c) {
        System.out.println("кординати   X Y Z :");
        for (int i = 0; i < c.cords.length; i++) {
            System.out.println(c.cords[i].x + " " + c.cords[i].y + " " + c.cords[i].z);
            System.out.println();

        }
    }


    static void showAll(Cords<? extends FourD> c) {
        System.out.println("кординати   X Y Z T:");
        for (int i = 0; i < c.cords.length; i++) {
            System.out.println(c.cords[i].x + " " + c.cords[i].y + " " + c.cords[i].z + " " + c.cords[i].t);
            System.out.println();

        }
    }

    public static void main(String[] args) {
        TwoD td[] = {
                new TwoD(0, 0),
                new TwoD(7, 9),
                new TwoD(18, 4),
                new TwoD(-1, -23),
        };
        Cords<TwoD> tdlocs = new Cords<>(td);
        System.out.println("содержимое обьекта tdlocs.");
        FourD fd []= {
            new  FourD(1,2,3,4),
            new  FourD(6,8,14,8),
            new  FourD(22,9,4,9),
            new  FourD(3,-2,-23,17),
        };
        Cords<FourD>fdlocs=new Cords<>(fd);
        System.out.println("содержимое обьекта fdlocs.");
        showXY(fdlocs);
        showXYZ(fdlocs);
        showAll(fdlocs);
    }
}
