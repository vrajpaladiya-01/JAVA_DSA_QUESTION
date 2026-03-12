public class Inheritance_Multi {
    public static void main(String[] args) {
       Dog Sheru = new Dog();
       Sheru.eat();
       Sheru.leg = 4;
       System.out.println(Sheru.leg); 
    }
}

//Parent class OR Base class
class Animal{
    String color;

    void eat(){
        System.out.println("Animal is Eats");
    }

    void breath(){
        System.out.println("Enimal is breathing");
    }
}

//Child-class OR Derived-class OR Sub-class 
class Mammal extends Animal{
    int leg;
}

class Dog extends Mammal{
    String breed;
}