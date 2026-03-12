import java.util.*;

class averageof3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number (A) : ");
        double a = sc.nextDouble();

        System.out.println("Enter second number (B) : ");
        double b = sc.nextDouble();

        System.out.println("Enter third number (C) : ");
        double c = sc.nextDouble();

        double sum = a + b + c;
        System.out.println("Sum of three Number : " + sum);

        double avg = sum / 3;
        System.out.println("Average of three Number : " + avg);

        sc.close();
    }
}