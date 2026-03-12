public class Recursion_Binary_String {
    public static void printConsecutiveOne(int n, int lastPlace, String str){
        if(n == 0){
            System.out.println(str);
            return; 
        }
        // if(lastPlace == 0){
        //     printBinary(n-1, 0, str.append("0"));
        //     printBinary(n-1, 1, str.append("1"));
        // }
        // else{
        //     printBinary(n-1, 0, str.append("0"));
        // }

        printConsecutiveOne(n-1, 0, str+"0");
        if(lastPlace == 0){
            printConsecutiveOne(n-1, 1, str+"1");
        }
    }

    public static void printConsecutiveZero(int n, int lastplace, String str){
        if(n == 0){
            System.out.println(str);
            return;
        }

        printConsecutiveZero(n-1, 1, str+"1");

        if(lastplace == 1){
            printConsecutiveZero(n-1, 0, str+"0");
        }
    }
    public static void main(String[] args) {
        printConsecutiveOne(3, 0, "");
        printConsecutiveZero(3, 0, "");
    }
}
