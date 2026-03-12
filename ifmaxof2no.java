import java.util.Scanner;

public class ifmaxof2no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first Number : ");
        int a = sc.nextInt();

        System.out.print("Enter the second Number : ");
        int b = sc.nextInt();

        if(a>b){
            System.out.println("Max No. : " + a);
        }
        else{
            System.out.println("Max No. : " + b);
        }

        sc.close();
    }
}
