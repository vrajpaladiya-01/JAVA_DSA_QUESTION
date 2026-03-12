public class Hierarchial_Inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.Swim();
    }
}

class Animal{
    String color;

    void eat(){
        System.out.println("Animal Eat time");
    }
}

class Mammal extends Animal{
    void Speak(){
        System.out.println("Animal is taking");
    }
}

class Fish extends Animal{
    void Swim(){
        System.out.println("Fish swim under water");
    }
}

class Monkey extends Animal{
    void Jump(){
        System.out.println("Donke is jumping");
    }
}