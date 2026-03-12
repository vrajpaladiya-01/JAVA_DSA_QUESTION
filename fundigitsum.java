public class fundigitsum {

    public static int sumofdigit(int n){
        int myNum = n;
        int reminder = 0;
        int sum = 0;

        while(n>0){
            reminder = n % 10;
            sum = sum + reminder;
            n = n/10;
        }
        System.out.println(sum);

        return sum;
    }
    public static void main(String[] args) {
        sumofdigit(1234);
    }
}
