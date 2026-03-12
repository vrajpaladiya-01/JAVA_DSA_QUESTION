public class Arr_Prefix_subarray {
    public static void Prefix_subarray(int numbers[]){
        int maxsum = Integer.MIN_VALUE;
        int minsum = Integer.MAX_VALUE;
        int cursum = 0;
        int prefix[] = new int[numbers.length];
        prefix[0] = numbers[0];

        for(int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + numbers[i];
        }

        for(int i=0; i<numbers.length; i++){
            int start = i;

            for(int j=i; j<numbers.length; j++){
                int end = j;

                cursum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
            }

            if(maxsum < cursum){
                maxsum = cursum;
            }

            if(minsum > cursum){
                minsum = cursum;
            }
        }
        System.out.println("Max sum of sub array : " + maxsum);
        System.out.println("Min sum of sub array : " + minsum);
    }
    public static void main(String[] args) {
        int numbers[] = {1, -2, 6, -1, 3};

        Prefix_subarray(numbers);
    }
}