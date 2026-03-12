public class OOPS {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.SetColor("Blue");
        System.out.println(p1.color);
        p1.SetToips(5);
        System.out.println(p1.tip);
        p1.SetColor("Red");
        System.out.println(p1.color);
    }
}

class Pen{
    String color;
    int tip;

    void SetColor(String NewColor){
        color = NewColor;
    }   

    void SetToips(int NewTip){
        tip = NewTip;
    }
}