public class remove_Element {
    public static int RemoveElement(int[] nums, int val){
        int k = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 2, 5, 2};
        int val = 2;

        int K = RemoveElement(nums, val);
        System.out.println(K);
        for(int i=0; i<K; i++){
            System.out.print(nums[i] + " ");
        }
    }
}