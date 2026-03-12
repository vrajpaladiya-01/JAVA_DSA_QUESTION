import java.util.Scanner;

public class sumofsi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Principal amount : ");
        float p = sc.nextFloat();

        System.out.print("Interest rate : ");
        float r = sc.nextFloat();

        System.out.print("Time period in year : ");
        float t = sc.nextFloat();

        float result = (p*r*t)/100;
        System.out.println("Interest amount : ");

        float total = result + p;
        System.out.println("Total amount : " + total);

        sc.close();
    }
}
