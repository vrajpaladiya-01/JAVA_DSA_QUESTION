import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int a = sc.nextInt();

        int fact = 1;

        if(a<0){
            System.out.println("Factorial is only positive number consider");
        }
        else{
            for(int i=1; i<=a; i++){
                fact *= i;
            }
            System.out.println(fact + " is final factorial number");
        }

        

        sc.close();
    }
}
