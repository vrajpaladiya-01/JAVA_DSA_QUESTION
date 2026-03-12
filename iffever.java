import java.util.Scanner;

public class iffever {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature : ");
        int a = sc.nextInt();

        if(a>100){
            System.out.println("You have fever");
        }
        else{
            System.out.println("You don't have fever");
        }
        sc.close();
    }
}
