import java.util.Scanner;

public class Demo_String {
    //charAt
    public static void PrintLtr(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        char arr[] = {'a', 'b', 'c', 'd'};
        String str = "abcd";
        String str2 = new String("Vraj");

        Scanner sc = new Scanner(System.in);
        String name;
        name = sc.nextLine();
        System.out.println(name);

        // String fullname = "Hello Friens";
        // System.out.println(fullname.length());

        String fn = "Vraj";
        String ln = "Paladiya";
        String fullname = fn + " " + ln;

        System.out.println(fullname);
        PrintLtr(fullname);
    }
}
