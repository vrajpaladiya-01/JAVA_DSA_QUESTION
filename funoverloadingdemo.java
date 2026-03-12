

public class funoverloadingdemo {
    public static int sum(int a, int b){
        return a+b;
    }

    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        System.out.println(sum(12, 43));
        System.out.println(sum(11, 12, 13));
    }
}
