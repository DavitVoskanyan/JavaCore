package classwork.lesson18;

import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        Set<String> set =new HashSet<>();
        set.add("poxos");
        set.add("poxosik");
        for (String s : set) {
            System.out.println(s);
        }


    }
    public  static void print(List<?>items){
        for (Object item : items) {
            System.out.println(item);
        }
    }
}
