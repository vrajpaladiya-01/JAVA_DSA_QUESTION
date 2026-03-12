import java.util.Scanner;

public class switchp1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the no. : ");
        int a = sc.nextInt();

        switch(a){
            case 1 : System.out.println("Samosa");
            break;

            case 2 : System.out.println("Pantra");
            break;

            case 3 : System.out.println("Mango milkshake");
            break;

            default : System.out.println("Wake up to reality");
        }

        sc.close();
    }
}
