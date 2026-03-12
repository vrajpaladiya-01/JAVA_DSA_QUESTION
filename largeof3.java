import java.util.Scanner;

public class largeof3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First no. : ");
        int a = sc.nextInt();

        System.out.print("Enter Second no. : ");
        int b = sc.nextInt();

        System.out.print("Enter Third no. : ");
        int c = sc.nextInt();

        if((a>=b) && (a>=c)){
            System.out.println(a + " is Largest number");
        }
        else if(b>=c){
            System.out.println(b + " is Largest number");
        }
        else{
            System.out.println(c + " is Largest number");
        }

        sc.close();
    }
}
