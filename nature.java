import java.util.Scanner;

public class nature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        System.out.print("Enter n nature number : ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            sum = sum + i;
        }
        System.out.println(sum);

        sc.close();
    }
}
