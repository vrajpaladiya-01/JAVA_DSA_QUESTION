public class Recursion_XPowN {
    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }

        // int xnm1 = power(x, n-1);
        // int xn = x * xnm1;
        // return xn;

        return x * power(x, n-1);
    }

    public static int OptimizedPowe(int a, int n){
        if(n == 0){
            return 1;
        }

        int halfpower = OptimizedPowe(a, n/2);
        int halfpowersq = halfpower * halfpower;

        // int halfpowersq = OptimizedPowe(a, n/2) * OptimizedPowe(a, n/2);

        //n is Odd
        if(n % 2 != 0){
            halfpowersq = a * halfpowersq;
        }

        return halfpowersq;
    }
    public static void main(String[] args) {
        System.out.println(power(4, 6));
        System.out.println(OptimizedPowe(3, 5));
    }
}
