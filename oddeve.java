import java.util.Scanner;

public class oddeve{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n no. : ");
        int n = sc.nextInt();

        int a = 0;
        int b = 0;

        for(int i=1; i<=n; i++){
            // System.out.println(i);
            if(i%2==0){
                a = a + i;
            }
            else{
                b = b + i;
            }
        }

        System.out.println(a + " is Even number");
        System.out.println(b + " is Odd number");

    
        sc.close();
    }
}


