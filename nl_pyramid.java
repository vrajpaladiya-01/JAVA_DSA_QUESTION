import java.util.Scanner;

public class nl_pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of rows : ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            for(int k=i; k>=1; k--){
                System.out.print(k + " ");
            }
            for(int a=2; a<=i; a++){
                System.out.print(a + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
