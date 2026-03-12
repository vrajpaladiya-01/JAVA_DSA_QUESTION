public class Recursion_Ocuurence {
    public static int FirstOcuurence(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }

        if(arr[i] == key){
            return i;
        }

        return FirstOcuurence(arr, key, i+1);
    }

    public static int lastOcuurence(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }

        int isFound = lastOcuurence(arr, key, i+1);

        if(isFound == -1 && arr[i] == key){
            return i;
        }

        return isFound;
    }
    public static void main(String[] args) {
        int arr[] = {8,5,4,3,2,4,5,7,8,6,5,2};
        System.out.println(FirstOcuurence(arr, 2, 0));
        System.out.println(lastOcuurence(arr, 2, 0));
    }
}
