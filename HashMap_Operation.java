import java.util.*;

public class HashMap_Operation {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();


        //Insertion (Put)   - O(1)
        hm.put("India", 100);
        hm.put("US", 150);
        hm.put("UK", 120);
        System.out.println(hm);

        //Get - O(1)
        int population = hm.get("India");
        System.out.println(population);

        System.out.println(hm.get("Indonatia"));

        // Contains Key = True/False    - O(1)
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Dubai"));

        //Remove  -  O(1)
        System.out.println(hm.remove("US"));
        System.out.println(hm);
        System.out.println(hm.remove("dubai"));

        //Size - O(1)
        System.out.println(hm.size());
        
        //Is empty - O(1)
        System.out.println(hm.isEmpty());

        //Clear  - O(1)
        hm.clear();
        System.out.println(hm.isEmpty());
    }
}
