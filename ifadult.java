import java.util.Scanner;

public class ifadult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Age : ");
        int age = sc.nextInt();

        if(age>=13){
            if(age>=13 && age<=17){
                System.out.println("Teenager");
            }
            else{
                System.out.println("Adult");
            }
        }
        else{
            System.out.println("Not Adult");
        }
        

        sc.close();
    }
}
