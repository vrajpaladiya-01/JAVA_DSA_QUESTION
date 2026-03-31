import java.util.*;

public class HashMap_twoSum {
    public static int[] twoSum(int[] arr, int target){
        Map<Integer, Integer> visited = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            int diff = target - arr[i];

            if(visited.containsKey(diff)){
                return new int[] {i, visited.get(diff)};
            }
            visited.put(arr[i], i);
        }

        return new int[] {-1, -1};
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 7, 9, 11};
        int target = 15;

        int[] result = twoSum(arr, target);
        System.out.println(Arrays.toString(result));
    }
}