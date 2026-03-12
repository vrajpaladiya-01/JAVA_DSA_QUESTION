public class Class_Queston1 {
    public static void main(String[] args) {
        Test t = new Test();
        t.Sum();
        t.Difference();
        t.Product();
    }
}

class Test{
    static int a = 15;
    static int b = 5;

    static void Sum(){
        int c = a + b;
        System.out.println(c);
    }

    static void Difference(){
        int c = a - b;
        System.out.println(c);
    }

    static void Product(){
        int c = a * b;
        System.out.println(c);
    }
}