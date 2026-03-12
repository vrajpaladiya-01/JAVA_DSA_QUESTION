public class Recursion_Find_Length {
    public static int lengthSub(String str){
        if(str.length() == 0){
                return 0;
        }

        return lengthSub(str.substring(1)) + 1;
    }
    public static void main(String[] args) {
        String str = "abcde";
        System.out.print(lengthSub(str));
    }
}
