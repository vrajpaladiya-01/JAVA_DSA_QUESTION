import java.util.*;

public class HashSet_Linked {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Surat");
        cities.add("Kolkata");
        cities.add("Bangaluru");
        System.out.println("HashSet element : " + cities);

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Surat");
        lhs.add("Kolkata");
        lhs.add("Bangaluru");
        System.out.println("Linked HashSet element : " + lhs);

        TreeSet<String> ts = new TreeSet<>();
        ts.add("Delhi");
        ts.add("Mumbai");
        ts.add("Surat");
        ts.add("Kolkata");
        ts.add("Bangaluru");
        System.out.println("TreeSet element : " + ts);
    }
}
