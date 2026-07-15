import java.util.*;

public class Bit_XOR_Operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the x value : ");
        int x = sc.nextInt();

        int result = x^x;

        System.out.println("XOR output : " + result);
    }
}
