public class funmultiply {

    public static int multiply(int a, int b){
            int product = a * b;
            return product;
    }
    public static void main(String[] args) {
        int a = 9;
        int b = 7;

        int prod = multiply(a, b);
        System.out.println(prod);

        prod = multiply(5, b);
        System.out.println(prod);
    }
}
