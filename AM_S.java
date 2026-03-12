public class AM_S {
    public static void main(String args[]){
        // BankAccount myAcc = new BankAccount();
        // myAcc.username = "vrajpaladiya";
        // myAcc.SetPasssword("abcdefgh");
    
        Pen p1 = new Pen();
        p1.SetColor("Pink");
        System.out.println(p1.getColor());
        p1.SetTip(5);
        System.out.println(p1.getTip());
        p1.SetColor("Black");
        System.out.println(p1.getColor());
        p1.SetTip(8);
        System.out.println(p1.getTip());

    }
}

class BankAccount {
    public String username;
    private String Password;
    public void SetPasssword(String pwd){
        Password = pwd;
    }
}

class Pen{
    private String color;
    private int tip;

    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }

    void SetColor(String NewColor){
        this.color = NewColor;
    }

    void SetTip(int NewTip){
        this.tip = NewTip;
    }
}