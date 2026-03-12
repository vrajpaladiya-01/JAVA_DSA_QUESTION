import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Sort {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(4);
        arr.add(7);
        arr.add(2);
        arr.add(9);
        arr.add(1);
        arr.add(6);

        System.out.println(arr);
        Collections.sort(arr);  //Ascending Order
        System.out.println(arr);

        //Descending Order
        Collections.sort(arr, Collections.reverseOrder());
        System.out.println(arr);
    }
}
