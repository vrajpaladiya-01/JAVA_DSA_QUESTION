import java.util.*;

public class Divide_Two_Integers {

    //Bruthforce Approach
    public static int div(int divinder, int divisior){
        int result = divinder / divisior;

        return result;
    }

    //Bit Manipulation
    public static int divBit(int divinder, int divisior){
        if(divinder == Integer.MIN_VALUE && divisior == -1){
            return Integer.MAX_VALUE;
        }

        long dvd = Math.abs((long) divinder);
        long dvs = Math.abs((long) divisior);

        int result = 0;

        while (dvd >= dvs) {
            long temp = dvs;
            int multiple = 1;

            while (dvd >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }
                dvd -= temp;
                result += multiple;
        }

        if((divinder > 0) ^ (divisior > 0)){
            result = -result;
        }

        return result;
    }
    public static void main(String[] args) {
        int divided = 10;
        int divisor = -3;

        System.out.println(divBit(divided, divisor));
    }
}
