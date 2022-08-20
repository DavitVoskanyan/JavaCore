package classwork.lesson18;



public class GenIFDemo {
    public static void main(String[] args) {
        Integer inum []={3,6,2,8,6};
        Character chs []={'b','r','p','w'};
        MyClass <Integer>iob  =new MyClass<Integer>(inum);
        MyClass<Character>cob=new MyClass<>(chs);
        System.out.println("максималное значение  в массиве inum:"+iob.max());
        System.out.println("максималное значение  в массиве inum:"+iob.min());
        System.out.println("максималное значение  в массиве chs:"+cob.max());
        System.out.println("максималное значение  в массиве chs:"+cob.min());
    }
}
