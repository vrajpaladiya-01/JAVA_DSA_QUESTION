public class Number_Of_Good_Pairs {
    public static int goodPairs(int[] nums){

        int count = 0;
        for(int i=0; i<nums.length; i++){
            int curr = nums[i];

            for(int j=i+1; j<nums.length; j++){
                if(curr == nums[j]){
                    System.out.print("(" + curr + " " + nums[j] + ")");
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] num = {1, 2, 4, 4, 3, 1, 1, 3, 2};

        int result = goodPairs(num);
        System.out.println();
        System.out.println(result);
    }
}
