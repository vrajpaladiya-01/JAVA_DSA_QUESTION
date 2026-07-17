import java.util.*;

public class Find_Duplicate_Number {

    //Bruthforce Approach
    public static void findDuplicate(int nums[]){
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    System.out.print("Duplicate number : " + nums[j]);
                    return;
                }
            }
        }
        System.out.println("Cann't find duplicate number");
    }

    //Using sorting
    public static void sortFindDuplicate(int nums[]){
        Arrays.sort(nums);
        int i = 0;

        for(int j=1; j<nums.length; j++){
            if(nums[i] == nums[j]){
                System.out.print("Duplicate number is found : " + nums[j]);
                return;
            }
            i++;
        }
        System.out.println("Cann't duplicate value found");
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 5, 6, 7};     
        
        sortFindDuplicate(nums);
    }
}