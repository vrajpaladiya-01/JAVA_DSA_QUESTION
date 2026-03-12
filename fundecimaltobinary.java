public class fundecimaltobinary {
    public static void decBin(int n){
        int myNum = n;
        int pow = 0;
        int binNum = 0;

        while(n>0){
            int lastdigit = n % 2;
            binNum = binNum + (lastdigit * (int)Math.pow(10, pow));
            pow++;
            n= n/2;
        }

        System.out.println("decimal of : " + myNum + " = " + binNum);
    }
    public static void main(String[] args) {
        decBin(17);
    }
}
