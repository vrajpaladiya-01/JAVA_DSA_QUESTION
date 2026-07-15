import java.util.*;

public class Bit_Swap_Value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first value : ");
        int a = sc.nextInt();

        System.out.print("Enter the second value : ");
        int b = sc.nextInt();

        System.out.println("Before swap : first value = " + a + ", second value = " + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After swap : first value = " + a + ", second value = " + b);
    }
}
