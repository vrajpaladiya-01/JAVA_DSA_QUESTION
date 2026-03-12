import java.util.ArrayList;

public class Array_PairSum2 {
    public static boolean Sum2(ArrayList<Integer> list, int target){
        int bp = -1;
        int n = list.size();

        for(int i=0; i<n-1; i++){
            if(list.get(i) > list.get(i+1)){
                bp = i;
                break;
            }
        }

        
        int lp = bp + 1;    //Smallest element
        int rp = bp;        //Largest element

        while (lp != rp) {
            int sum = list.get(lp) + list.get(rp); 
            //Case 1
            if(sum == target){
                return true;
            }

            //Case 2
            if(sum < target){
                lp = (lp + 1) % n;
            }
            else{
                // Case 3
                rp = (n + rp - 1) % n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(15);
        list.add(11);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 15;

        System.out.print(Sum2(list, target));
    }
}