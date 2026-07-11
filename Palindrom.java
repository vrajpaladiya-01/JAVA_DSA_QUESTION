public class Palindrom {
    public static boolean palindrom(int n){
        if(n < 0 || (n %10 == 0 && n != 0)){
            return false;
        }

        int ReverseHalf = 0;

        while(n > ReverseHalf){
            ReverseHalf =   ReverseHalf * 10 + n % 10;
            n /= 10;
        }

        return n == ReverseHalf || n == ReverseHalf/10;
    }
    public static void main(String[] args) {
        System.out.println(palindrom(123321));
    }
}
