import java.util.*;

public class Hash_Union_Intersection {
    public static void main(String[] args) {
        int arr1[] = {7, 3, 9};
        int arr2[] = {6, 3, 9, 2, 9, 4};

        HashSet<Integer> hs = new HashSet<>();

        // Union
        for(int i=0; i<arr1.length; i++){
            hs.add(arr1[i]);
        }
        for(int i=0; i<arr2.length; i++){
            hs.add(arr2[i]);
        }

        System.out.println(hs);
        System.out.println("Union = " + hs.size());

        // Intersection
        hs.clear();
        for(int i=0; i<arr1.length; i++){
            hs.add(arr1[i]);
        }

        HashSet<Integer> intersection = new HashSet<>();
        for(int i=0; i<arr2.length; i++){
            if(hs.contains(arr2[i])) {
                intersection.add(arr2[i]);
            }
        }

        System.out.println(intersection);
        System.out.println("Intersection = " + intersection.size());
    }
}
