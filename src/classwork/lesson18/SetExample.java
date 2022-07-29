package classwork.lesson18;

import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        Set<String>treeSet=new TreeSet<>();
        treeSet.add("zaven");
        treeSet.add("poxos");
        treeSet.add("aram");

        for (String s : treeSet) {
            System.out.println(s);
        }
    }
}
