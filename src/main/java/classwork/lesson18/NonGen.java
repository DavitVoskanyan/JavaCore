package classwork.lesson18;

public class NonGen {
    Object ob;
    int num;
    NonGen (int i){
        num=i;
    }
    int getNum(){
        return num;
    }

    NonGen(Object o) {
        ob = o;

    }

    Object getOb() {
        return ob;

    }

    void showType() {
        System.out.println("обьект об относится к типу " + ob.getClass().getName());


    }
}
