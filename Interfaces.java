public class Interfaces {
    public static void main(String[] args) {
        // Queen q = new Queen();
        // q.Moves();

        Beer b = new Beer();
        b.eat();
    }
}


//Interface
interface ChessPlayer {
    void Moves();
}

class Queen implements ChessPlayer{
    public void Moves(){
        System.out.println("Up, Down, Left, Right, Diagonal (in all 4 direction)");
    }
}

class Rook implements ChessPlayer{
    public void Moves(){
        System.out.println("Up, Down, Left, Right");
    }
}

class King implements ChessPlayer{
    public void Moves(){
        System.out.println("Up, Down, Left, Right, Diagonal (in 1 Steo");
    }
}

//Multiple inheritance

interface Herbivore{
    void eat();
}

interface Carnivore{
    void eat();
}

class Beer implements Herbivore, Carnivore{
    public void eat(){
        System.out.println("Beer is eating grass and meat");
    }
}