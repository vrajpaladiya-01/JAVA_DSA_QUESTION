import java.util.Scanner;

public class whilenaturalno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1; 
        int sum = 0;

        System.out.print("Enter Natural number : ");
        int n = sc.nextInt();

        while(i<=n){
            sum += i;
            i++;
        }

        System.out.println("Sum is : " + sum);

        sc.close();
    }
}
