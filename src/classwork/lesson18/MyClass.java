package classwork.lesson18;

public class MyClass<T extends Comparable<T>> implements MinMax<T> {
    T[] val;
    MyClass(T [] o){
        val=o;

    }
    public T min (){
        T v = val[0];
        for (int i = 1; i <val.length ; i++) {
            if (val[i].compareTo(v) < 0) v = val[i];
        }return v;
    }
    public  T max(){
        T v =val[0];
        for (int i = 1; i <val.length ; i++) {
if (val[i].compareTo(v)>0) v=val[i];
        }
        return v;
    }
}
