import java.util.Scanner;

public class nl_tringletr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of lines : ");
        int a = sc.nextInt();

        for(int i=1; i<=a; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
