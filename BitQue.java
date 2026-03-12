public class BitQue {

    public static boolean PowerOfTwo(int n){
        return (n & (n-1)) == 0;
    }

    public static int countSet(int n){
        int count = 0;

        while(n > 0){
            if((n&1) != 0){
                count++;
            }
            n = n>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countSet(10));
    }
}
