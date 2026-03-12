import java.util.*;

public class HashSet_Iteration {
    public static void main(String[] args) {
        HashSet<String> city = new HashSet<>();

        city.add("Delhi");
        city.add("Mumbai");
        city.add("Surat");
        city.add("Bengaluru");

        // Iterator it = city.iterator();
        // while (it.hasNext()) {
        //     System.out.println(it.next());
        // }

        for(String cities : city){
            System.out.println(cities);
        }
    }
}
