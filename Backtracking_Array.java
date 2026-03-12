public class Backtracking_Array {
    public static void ChangeArr(int arr[], int i, int value){
        //Base
        if(i == arr.length){
            PrintArr(arr);
            return;
        }

        //Work
        arr[i] = value;  // Vraj Paladiya from surat gujarat, 395
        ChangeArr(arr, i+1, value+1);
        arr[i] = arr[i] - 2;
    }

    public static void PrintArr(int arr[]){
        for(int i=0;i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = new int[5];
        ChangeArr(arr, 0, 11);
        PrintArr(arr);
    }
}
