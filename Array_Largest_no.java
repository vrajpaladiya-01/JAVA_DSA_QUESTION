import java.util.*;

public class Array_Largest_no {
    public static int GetLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i=0; i<numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
        }

        for(int i=0; i<numbers.length; i++){
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }

        System.out.println("Smallest no of : " + smallest);
        return largest;
    }
    public static void main(String[] args) {
        int numbers[] = {5, 7, 9, 3, 6, 11 ,2, 14};

        System.out.println("Largest no of : " + GetLargest(numbers));
    }
}
