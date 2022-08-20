package classwork.lesson18;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> names = new HashMap<>();
        names.put(111, "poxos");
        names.put(222,"petros");
        names.put(2222,"aram");

        Collection<String> values = names.values();
        for (String value : values) {
            System.out.println(value);
        }
        Set<Integer>integers=names.keySet();
        for (Integer integer : integers) {
            System.out.println(integer  );
        }
    }
}
