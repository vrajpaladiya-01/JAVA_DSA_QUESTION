import java.util.Scanner;

public class funsum {

    public static int calsum(int n1, int n2){
        int sum = n1 + n2;
        System.out.println("Sum is : " + sum);
        return sum;
    }
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);

        System.out.print("Enter a : ");
        int a = sc.nextInt();

        System.out.print("Enter b : ");
        int b = sc.nextInt();

        calsum(a, b);
    }
}
