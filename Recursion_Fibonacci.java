public class Recursion_Fibonacci {
    public static int fib(int n){
        if(n == 0 || n ==1){
            return n;
        }
        int Fnm1 = fib(n-1);
        int Fnm2 = fib(n-2);
        int fn = Fnm1 + Fnm2;

        return fn;
    }
    public static void main(String[] args) {
        int n = 7;

        System.out.println(fib(n));
        System.out.println(fib(8));
        System.out.println(fib(9));
        System.out.println(fib(10));
        System.out.println(fib(11));
        System.out.println(fib(12));
        System.out.println(fib(13));
        
    }
}
