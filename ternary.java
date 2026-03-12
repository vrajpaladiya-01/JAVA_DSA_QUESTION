import java.util.Scanner;

public class ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int a = sc.nextInt();

        String no = ((a%2) == 0) ? "Even" : "Odd";
        System.out.println(no);

        sc.close();
    }
}
