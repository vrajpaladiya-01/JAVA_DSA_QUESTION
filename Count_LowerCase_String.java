import java.util.*;

public class Count_LowerCase_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;

        System.out.print("Enter your string : ");
        name = sc.nextLine();

        int count = 0;

        for(int i=0; i<name.length(); i++){
            char ch = name.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }

        System.out.println("Total lowercase vowel charcter in a string : " + count);
    }
}
