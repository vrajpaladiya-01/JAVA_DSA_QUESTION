public class funpalindrom {

    public static int palindromno(int n){
        int myNum = n;
        int result = 0;
        int reminder = 0;

        while(n>0){
            reminder = n % 10;
            result = (result * 10) + reminder;
            n = n/10;
        }

        if(result == myNum){
                System.out.println(myNum + " is palindrom Number");
        }
        else{
            System.out.println(myNum + " is Not palindrom Number");
        }

        return result;
    }
    public static void main(String[] args) {
        palindromno(121);
    }
}
