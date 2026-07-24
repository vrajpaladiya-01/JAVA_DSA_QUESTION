public class IMP_Recursion_Find_indexOfKey {

    //Bruthforce Approach
    public static void find(int arr[], int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                System.out.print(i + " ");
            }
        }
    }

    //Recursion
    public static void FindIndex(int arr[], int index, int key){
        if(index == arr.length){
            return;
        }

        if(arr[index] == key){
            System.out.print(index + " ");
        }

        FindIndex(arr, index + 1, key);
    }
    public static void main(String[] args) {
        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};

        // FindIndex(arr, 0, 2);
        find(arr, 2);
    }
}
