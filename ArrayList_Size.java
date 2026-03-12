import java.util.ArrayList;

public class ArrayList_Size {
    public static void main(String[] args) {
        ArrayList<Integer> n = new ArrayList<>();

        n.add(1);
        n.add(2);
        n.add(3);
        n.add(4);
        n.add(5);

        //Print the number of size
        System.out.println(n.size());

        for(int i=0; i<n.size(); i++){
            System.out.print(n.get(i) + " ");
        }

    }
}