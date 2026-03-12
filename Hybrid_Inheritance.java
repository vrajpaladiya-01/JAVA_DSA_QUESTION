public class Hybrid_Inheritance {
    public static void main(String[] args) {
        Human Vraj = new Human();
        Vraj.eat();
        Vraj.Walk();
        Vraj.Dog();

        System.out.println();

        Sparrow Fly1 = new Sparrow();
        Fly1.eat();
        Fly1.Fly();
        Fly1.Chew();

        System.out.println();

        Shark swim1 = new Shark();
        swim1.eat();
        swim1.Speed();
        swim1.Swim();
        
    }
}

class Animal{
    String color;

    void eat(){
        System.out.println("Busy in eating");
    }
}

class Fish extends Animal{
    void Swim(){
        System.out.println("Busy for swim under water");
    }
}

class Bird extends Animal{
    void Fly(){
        System.out.println("Busy for flying in the sky");
    }
}

class Mammal extends Animal{
    void Dog(){
        System.out.println("I am dog");
    }
}

class Shark extends Fish{
    int bids;

    void Speed(){
        System.out.println("Shark speed is very high");
    }
}

class Sparrow extends Bird{
    void Chew(){
        System.out.println("Sparrow is call your friend");
    }
}

class Human extends Mammal{
    void Walk(){
        System.out.println("People are walking daily morning. ");
    }
}