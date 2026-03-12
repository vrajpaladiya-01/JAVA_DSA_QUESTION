import java.util.*;

public class HashMap_Iteration {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("India", 120);
        hm.put("US", 100);
        hm.put("China", 150);
        hm.put("Bhutan", 20);
        hm.put("UK", 190);

        //iterate
        // entry set
        Set<String> keys  = hm.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("key = " + k + " value = " + hm.get(k));
        }
    }
}
