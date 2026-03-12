import java.util.Scanner;

public class pve_nve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number : ");
        int a = sc.nextInt();

        if(a>=1){
            System.out.println(a + " is Positivie");
        }
        else if(a == 0){
            System.out.println(a + " is Zero");
        }
        else{
            System.out.println(a + " is Negative");
        }

        sc.close();
    }
}
