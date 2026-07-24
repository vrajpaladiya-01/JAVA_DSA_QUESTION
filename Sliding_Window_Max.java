public class Sliding_Window_Max {
    public static void Sliding_Window(int[] nums, int key) {

        for (int i = 0; i <= nums.length-key; i++) {
            int max = nums[i];
            for(int j=i; j<i+key; j++){
                max = Math.max(max, nums[j]);
            }
            System.out.print(max + " ");
        }
    }

    public static void main(String[] args) {
        int[] nums = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int key = 3;

        Sliding_Window(nums, key);
    }
}