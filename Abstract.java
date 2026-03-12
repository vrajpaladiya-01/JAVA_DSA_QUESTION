public class Abstract {
    public static void main(String[] args) {
        // Hourse h = new Hourse();
        // h.eat();
        // h.walk();
        // System.out.println(h.color);

        Mustang MyHourse = new Mustang();
        //Animal -> Hourse -> Mustang
    }
}

abstract class Animal{
    String color;
    
    Animal(){
        System.out.println("Animal is called..");
    }
    void eat(){
        System.out.println("Animal eats ");
    }

    abstract void walk();
}

class Hourse extends Animal{
    Hourse(){
        System.out.println("Hourse is called..");
    }
    void changecolor(){
        color = "Dark Brown";
    }

    void walk(){
        System.out.println("Walk on 4 legs");
    }
}

class Mustang extends Hourse{
    Mustang(){
        System.out.println("Mustang is called..");
    }
}

class Monkey extends Animal{
    void changecolor(){
        color = "Gray";
    }

    void walk(){
        System.out.println("Walk on 2 legs");
    }
}