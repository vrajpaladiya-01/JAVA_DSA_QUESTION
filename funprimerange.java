public class funprimerange {

    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        
        if(n==2){
            return true;
        }

        for(int i=2; i<=n-1; i++){
            if(n % i == 0){
                return false;
            }
        }

        return true;
    }

    public static void primerange(int n){
        for(int i=1; i<=n; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.println("Prime : " + isPrime(15));
        primerange(20);
    }
}
