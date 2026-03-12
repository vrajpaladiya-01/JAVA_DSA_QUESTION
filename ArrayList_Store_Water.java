import java.util.ArrayList;

public class ArrayList_Store_Water {



    //Brute Force Approach  O(n^2)
    public static int storeWater(ArrayList<Integer> height){
        int maxWater = 0;

        for(int i=0; i<height.size(); i++){
            for(int j=i+1; j<height.size(); j++){
                int ht = Math.min(height.get(i), height.get(j));
                int wi = j - i;
                int CurrWater = ht * wi;
                maxWater = Math.max(maxWater, CurrWater);
            }
        }
        return maxWater;
    }




    // 2 Pointer Approach   O(n)
    public static int storeWater2(ArrayList<Integer> height) {
        int maxWater = 0;
        int lp = 0;
        int rp = height.size()-1;

        while (lp < rp) {
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp - lp;
            int CurrWater = ht * width;
            maxWater = Math.max(maxWater, CurrWater);

            if(height.get(lp) < height.get(rp)){
                lp++;
            }
            else{
                rp--;
            }
        }

        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(9);

        System.out.println(storeWater(height));
        System.out.println(storeWater2(height));
    }
}
