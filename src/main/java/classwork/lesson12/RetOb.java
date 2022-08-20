package classwork.lesson12;

public class RetOb {
    public static void main(String[] args) {
        Test ob1 = new Test(2);
        Test ob2;
        ob2=ob1.IncrByTen();
        System.out.println("ob1.a:"+ob1.a);
        System.out.println("ob1.a:"+ob2.a);
        ob2=ob2.IncrByTen();
        System.out.println("ob2.a послевторого увеличения значения: "+ob2.a );

    }
}
