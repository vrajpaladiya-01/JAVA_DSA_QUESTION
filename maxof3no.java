import java.util.Scanner;

public class maxof3no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number : ");
        int a = sc.nextInt();

        System.out.print("Enter Second number : ");
        int b = sc.nextInt();

        System.out.print("Enter third number : ");
        int c = sc.nextInt();

        if(a>b){
            if(a>c){
                System.out.println("Max number is : " + a);
            }
            else{
                System.out.println("Max number is : " + c);
            }
        }
        else{
            if(b>c){
                System.out.println("Max number is : " + b);
            }
            else{
                System.out.println("Max number is : " + c);
            }
        }

        sc.close();
    }
}
