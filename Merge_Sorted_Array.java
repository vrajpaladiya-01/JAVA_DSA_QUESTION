import java.lang.reflect.Array;
import java.util.Arrays;

public class Merge_Sorted_Array {
    public static void main(String[] args) {
        int num1[] = {1, 2, 3, 4, 5, 0, 0, 0};
        int m = 5;

        int num2[] = {2, 5, 6};
        int n = 3;

        int temp[] = new int[m + n];

        for(int i=0; i<m; i++){
            temp[i] = num1[i];
        }

        for(int i=0; i<n; i++){
            temp[m + i] = num2[i];
        }

        Arrays.sort(temp);

        for(int j=0; j<m+n; j++){
            num1[j] = temp[j];  
        }

        System.out.print(Arrays.toString(num1));
    }
}
