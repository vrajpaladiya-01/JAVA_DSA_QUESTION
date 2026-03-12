import java.util.ArrayList;

public class ArrayList_Swap {
    public static void Swap(ArrayList<Integer> num, int idx1, int idx2){
        int temp = num.get(idx1);
        num.set(idx1, num.get(idx2));
        num.set(idx2, temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(2);
        num.add(5);
        num.add(7);
        num.add(1);
        num.add(8);

        int idx1 = 1, idx2 = 3;
        System.out.println(num);
        Swap(num, idx1, idx2);
        System.out.println(num);
    }
}
