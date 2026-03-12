import java.util.Scanner;

public class areaofcircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float pi = 3.14f;
        System.out.print("Enter the radius of circle : ");
        int r = sc.nextInt();

        float area = pi * r * r;
        System.out.println("Area of circle : " + area);

        sc.close();
    }
}
