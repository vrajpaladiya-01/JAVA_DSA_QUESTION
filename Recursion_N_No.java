public class Recursion_N_No {
    public static int naturalNo(int n){
        if(n == 1){
            return 1;
        }

        int sumNM1 = naturalNo(n-1);
        int sum = n + sumNM1;
        return sum;
    }
    public static void main(String[] args) {
        int n = 12;

        System.out.println(naturalNo(n));
    }
}
