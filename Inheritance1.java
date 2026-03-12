public class Inheritance1 {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
    }
}

//Parent Class OR Base Class
class Animal{
    String color;

    void eat(){
        System.out.println("Eats");
    }

    void breath(){
        System.out.println("Breaths");
    }
}

//Child Class OR Dervied Class Or Sub Class
class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("Swim in Water");
    }
}