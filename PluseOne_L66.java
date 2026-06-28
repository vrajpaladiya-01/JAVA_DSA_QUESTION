import java.util.*;

public class PluseOne_L66 {
    public static int[] pluseOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1;

        return result;
    }   

    public static void main(String[] args) {
        int[] digits = {9, 9, 9};

        int[] result = pluseOne(digits);

        System.out.println(Arrays.toString(result));
    }
}
