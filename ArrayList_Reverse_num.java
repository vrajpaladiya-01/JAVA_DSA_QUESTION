import java.util.*;

public class ArrayList_Reverse_num {
    public static void main(String[] args) {
        ArrayList<Integer> no = new ArrayList<>();

        no.add(1);
        no.add(2);
        no.add(3);
        no.add(4);
        no.add(5);

        System.out.println(no);
        System.out.println();

        for(int i=no.size()-1; i>=0; i--){
            System.out.print(no.get(i) + " ");
        }
    }
}
