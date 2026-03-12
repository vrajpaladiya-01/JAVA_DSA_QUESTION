public class Hash_2Sum {
    public static void main(String[] args) {
        int arr[] = {2, 5, 7, 11, 15};
        int start, end, sum;
        int target = 26;

        for(int i=0; i<arr.length; i++){
            start = arr[i];

            for(int j=0; j<=arr.length; j++){
                end = arr[j];
                sum = start + end;
                if(sum == target){
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    }
}
