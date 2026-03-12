public class Super_key {
    public static void main(String[] args) {
        
    }
}

class Animal{
    Animal(){
        System.out.println("Animal constructor called..");
    }
}

class Hourse extends Animal{
    Hourse(){
        super();
        System.out.println("Hourse constructor called..");
    }
}