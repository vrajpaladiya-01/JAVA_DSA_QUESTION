public class IMP_Recursion_IntToString {

    static String words[] = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

    public static void Convert_Int_To_String(int n){
        if(n == 0){
            return;
        }
        int digit = n % 10;
        Convert_Int_To_String(n/10);

        System.out.print(words[digit] + " ");
    }
    public static void main(String[] args) {
        int number = 57839;

        if(number == 0){
            System.out.print("Zero");
        }
        else if(number % 10 == 0){
            System.out.print("This number is wrong because last digit zero is not allow");
        }
        else{
            Convert_Int_To_String(number);
        }
    }
}
