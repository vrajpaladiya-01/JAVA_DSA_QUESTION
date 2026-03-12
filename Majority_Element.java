public class Majority_Element {
    // public static int majorityElement(int num[]){
    //     int majorityCount = num.length/2;

    //     for(int i=0; i<num.length; i++){
    //         int count = 0;
    //         for(int j=0; j<num.length; j++){
    //             if(num[j] == num[i]){
    //                 count += 1;
    //             }
    //         }
    //         if(count > majorityCount){
    //             return num[i];
    //         }
    //     }
    //     return -1;
    // }

    public static int countInRange(int nums[], int num, int lo, int hi){
        int count = 0;

        for(int i=lo; i<=hi; i++){
            if(nums[i] == num){
                count++;
            }   
        }
        return count;
    }

    public static int majorityElementRec(int nums[], int lo, int hi){
        if(lo == hi){
            return nums[lo];
        }

        int mid = lo +(hi - lo)/2;
        int left = majorityElementRec(nums, lo, mid);
        int right = majorityElementRec(nums, mid+1, hi);

        if(left == right){
            return left;
        }

        int leftcount = countInRange(nums, left, lo, hi);
        int rightcount = countInRange(nums, right, lo, hi);

        return leftcount > rightcount ? left : right;
    }

    public static int majorityElement(int num[]){
        return majorityElementRec(num, 0, num.length-1);
    }
    public static void main(String[] args) {
        int num[] = {3, 3, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3};
        System.out.println(majorityElement(num));
    }
}
