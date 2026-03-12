import java.util.Scanner;

public class ifNod_ev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the No. : ");
        int a = sc.nextInt();

        if(a %2 == 0){
            System.out.println(a + " Number is EVEN");
        }
        else{
            System.out.println(a + " Number is ODD");
        }

        sc.close();
    }
}
