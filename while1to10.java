import java.util.Scanner;

public class while1to10 {
    public static void main(String[] args) {
        int a = 1;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. : ");
        int b = sc.nextInt();

        while (a<=b) {
            System.out.print(a + " ");
            a++;
        }
    }
}
