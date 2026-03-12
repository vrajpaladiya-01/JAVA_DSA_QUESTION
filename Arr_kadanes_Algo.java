public class Arr_kadanes_Algo {
    public static void kadanes_Algo(int numbers[]){
        int cs = 0;
        int ms = Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++){
            cs += numbers[i];

            if(cs < 0){
                cs = 0;
            }

            ms = Math.max(cs, ms);
        }
        System.out.print("Max sum of subArray is : " + ms);
    }

    public static void Negative_kadanes(int arr[]){
        int cs = arr[0];
        int ms = arr[0];

        for(int i=0; i<arr.length; i++){
            cs += arr[i];

            if(cs < 0){
                cs = arr[i];
            }
            
            ms = Math.max(cs, ms);
        }

        System.out.println("Maxsum of SubArray is : " + ms);
    }

    // public static void Negative_kadanes(int arr[]){
    //     int cs = arr[0];
    //     int ms = arr[0];

    //     for(int i=0; i<arr.length; i++){
    //         cs = Math.max(arr[i], cs + arr[i]);
    //         ms = Math.max(cs, ms);
    //     }

    //     System.out.println("Maxsum of SubArray is : " + ms);
    // }
    public static void main(String[] args) {
        int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        int arr[] = {-2, -3, -4, -1, -5};

        // kadanes_Algo(numbers);
        Negative_kadanes(arr);
    }
}
