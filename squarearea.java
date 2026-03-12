import java.util.Scanner;

public class squarearea {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter area of single side in square area in meter : ");
        int a = sc.nextInt();

        int ans = a * a;
        System.out.println("Total Area is : " + ans + " meter");

        sc.close();
    } 
}
