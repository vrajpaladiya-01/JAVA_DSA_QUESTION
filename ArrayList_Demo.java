import java.util.ArrayList;

public class ArrayList_Demo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Boolean> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();

        //Add Element   O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);


        //Get Element   O(1)
        int value = list.get(2);
        System.out.println(value);


        //Remove Element    O(n)
        list.remove(1);
        System.out.println(list);


        //Set Element at index  O(n)
        list.set(1, 7);
        System.out.println(list);

        //Contains Element  O(n)
        System.out.println(list.contains(5));
        System.out.println(list.contains(9));



        //Specific index value add      O(n)
        list.add(1, 8);
        System.out.println(list);
    }
}
