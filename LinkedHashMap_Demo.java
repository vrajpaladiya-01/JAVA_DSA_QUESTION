import java.util.*;

public class LinkedHashMap_Demo {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        TreeMap<String, Integer> tm = new TreeMap<>();
        HashMap<String, Integer> hm = new HashMap<>();

        lhm.put("India", 150);
        lhm.put("UK", 200);
        lhm.put("US", 160);

        hm.put("India", 150);
        hm.put("UK", 200);
        hm.put("US", 160);

        tm.put("India", 150);
        tm.put("UK", 200);
        tm.put("US", 160);

        System.out.println(lhm);
        System.out.println(hm);
        System.out.println(tm);
    }
}