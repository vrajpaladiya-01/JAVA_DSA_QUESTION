public class Recursion_no_Dec_Incr {

    public static void PrintDec(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        PrintDec(n-1);
    }

    public static void printIncr(int n){
        if(n == 1){
            System.out.print(n + " ");
            return;
        }

        printIncr(n-1);
        System.out.print(n+ " ");
    }
    public static void main(String[] args) {
        int n = 10;
        PrintDec(n);
        printIncr(n);
    }
}
