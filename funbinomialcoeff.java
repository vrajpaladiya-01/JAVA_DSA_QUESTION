import java.util.Scanner;

public class funbinomialcoeff {

    public static int factorialofn(int n){
        int f = 1;
        
        for(int i=1; i<=n; i++){
            f = f * i; 
        }
        return f;
    }

    public static int factorialofr(int r){
        int fc = 1;
        
        for(int i=1; i<=r; i++){
            fc = fc * i; 
        }
        return fc;
    }

    public static int factorialofnmr(int n, int r){
        int fact = 1;
        
        for(int i=1; i<=(n-r); i++){
            fact = fact * i; 
        }
        return fact;
    }  

    public static int bioCoeff(int n, int r){
        int fact_n = factorialofn(n);
        int fact_r = factorialofr(r);
        int fact_nmr = factorialofnmr(n, r);

        int bico = fact_n / (fact_r * fact_nmr);

        return bico;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of n : ");
        int n = sc.nextInt();

        System.out.print("Enter no of r : ");
        int r = sc.nextInt();

        int final_bico = bioCoeff(n, r);
        System.out.println(final_bico);

        // int fn = factorialofn(n);
        // int fr = factorialofr(r);
        // int fnmr = factorialofnmr(n, r);

        // System.out.println(fn);
        // System.out.println(fr);
        // System.out.println(fnmr);
    }
}
