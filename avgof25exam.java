import java.util.Scanner;

public class avgof25exam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int i=1;
        for(i=1; i<=25; i++){
            System.out.print("Enter " + i + " Exam Marks : ");
            int a = sc.nextInt();

            sum = sum + a;
        }

        System.out.println("Total Marks is : " + sum);

        double avg = sum / 25;
        System.out.println("Average is : " + avg);

        sc.close();
    }
}
