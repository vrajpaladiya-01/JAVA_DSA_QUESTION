public class Method_Overloading {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.sum(1, 4));
        System.out.println(cal.sum(1.7f, 3.3f));
        System.out.println(cal.sum(4, 8, 3));
    }
}

class Calculator{
    int sum(int a, int b){
        return a + b;
    }

    float sum(float a, float b){
        return a + b;
    }

    int sum(int a, int b, int c){
        return a + b + c;
    }
}