public class Arr_subarray {

    public static void subarray(int numbers[]){
        int large = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;
        
        int ts = 0;
        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                int sum = 0;
                for(int k=start; k<=end; k++){
                    System.out.print(numbers[k]);

                    sum +=numbers[k];
                }
                ts++;

                if(large < sum){
                    large = sum;
                }

                if(small > sum){
                    small = sum;
                }

                System.out.println();
                System.out.println("Sum of SubArray : " + sum);
            }
            
            System.out.println();
        }

        System.out.println("Total subArray is : " + ts);
        System.out.println("Max Sum of SubArray : " + large);
        System.out.println("Min Sum of SubArray : " + small);
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};

        subarray(numbers);
    }
}
