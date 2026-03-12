import java.util.Scanner;

public class gtof2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first value (A) : ");
        int a = sc.nextInt();

        System.out.print("Enter second value (B) : ");
        int b = sc.nextInt();

        if(a>b){
            System.out.println("Greater is : " + a);
        }
        else{
            System.out.println("Greater is : " + b);
        }

        sc.close();
    }
}
