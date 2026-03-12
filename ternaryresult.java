import java.util.Scanner;

public class ternaryresult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your final examination marks : ");
        int marks = sc.nextInt();

        String result = marks >= 33 ? "Pass in exam" : "Fail in exam";
        System.out.println(result);

        sc.close();
    }
}
