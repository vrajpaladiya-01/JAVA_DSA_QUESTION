import java.util.*;

public class Greedy_Knapsack {
    public static void main(String[] args) {
        int val[] = {60, 100, 120};
        int weight[] = {10, 20, 30};
        int w = 50;

        double ratio[][] = new double[val.length][2];

        // 0th col => idx; 1st col => ratio
        for(int i=0; i<val.length; i++){
            ratio[i][0] = i;
            ratio[i][1] = val[i] / (double)weight[i];
        }

        //assending order
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int Capacity = w;
        int finalVal = 0;

        for(int i=ratio.length-1; i>=0; i--){
            int idx = (int)ratio[i][0];
            if(Capacity >= weight[idx]){
                finalVal += val[idx];
                Capacity -= weight[idx];
            }
            else{
                //Include fractional item
                finalVal += (ratio[i][1] * Capacity);
                Capacity = 0;
                break;
            }
        }

        System.out.println("Final value = " + finalVal);
    }
}