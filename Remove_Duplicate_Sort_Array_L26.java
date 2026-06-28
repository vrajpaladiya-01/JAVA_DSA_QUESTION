public class Remove_Duplicate_Sort_Array_L26 {
    public int RemoveDuplicate(int[] arr){
        // if(arr.length == 0){
        //     return 0;
        // }

        int i = 0;

        for(int j=0; j<arr.length; j++){
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }
    public static void main(String[] args){
        int[] arr1 = {0, 0, 1, 1, 1, 2, 2, 3,};
        Remove_Duplicate_Sort_Array_L26 obj = new Remove_Duplicate_Sort_Array_L26();

        int result = obj.RemoveDuplicate(arr1);
        System.out.println(result);
    }
}