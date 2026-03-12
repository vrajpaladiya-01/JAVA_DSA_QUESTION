import java.util.Scanner;

public class sumof2no {
    public static void main(String[] args) {
        Scanner vraj = new Scanner(System.in);

        System.out.print("Enter First Number : ");
        int a = vraj.nextInt();

        System.out.print("Enter second number : ");
        int b = vraj.nextInt();

        int add = a+b;
        System.out.println("Addition is : " + add);

        int sub = a-b;
        System.out.println("Subtracation is : " + sub);

        int mul = a*b;
        System.out.println("Multiplication is : " + mul);

        float div = a/b;
        System.out.println("Division is : " + div);

        float modulo = a%b;
        System.out.println("Modulo is : " + modulo);

        vraj.close();
    }
}
