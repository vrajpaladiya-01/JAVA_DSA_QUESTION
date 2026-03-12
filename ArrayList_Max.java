import java.util.ArrayList;

public class ArrayList_Max {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(8);
        list.add(4);
        list.add(9);
        list.add(5);
        list.add(1);

        int max = Integer.MIN_VALUE;

        //Time Complecity   O(n)
        for(int i=0; i<list.size(); i++){
            // if(max < list.get(i)){
            //     max = list.get(i);
            // }

            max = Math.max(max, list.get(i));
        }

        System.out.println("Maximum element is : " + max);
    }
}
