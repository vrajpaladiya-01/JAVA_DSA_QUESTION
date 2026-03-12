import java.util.Scanner;

public class whilereverseno {
    public static void main(String[] args) {
        // int n = 10899;

        // while(n > 0){
        //     int lastdigit = n %10;
        //     System.out.print(lastdigit);

        //     n = n/10;
        // }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the original number : ");
        int n = sc.nextInt();
        int rev = 0;

        while(n > 0){
            int lastdigit = n%10;
            rev = (rev * 10) + lastdigit;
            n = n/10;
        }

        System.out.println("Reverse Number : " + rev);
    }
}
