public class InterfaceJava {
    public static void main(String [] args) {
        Queen q = new Queen();
        q.moves();
        Pawn p = new Pawn();
        p.moves();
    }
}

interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves(){
        System.out.println("Moves in all directions");
    }
}

class Pawn implements ChessPlayer {
    public void moves() {
        System.out.println("Moves one step at a time");
    }
}

class Knight implements ChessPlayer {
    public void moves() {
        System.out.println("Moves in Two and half step in up, down, left and right.");
    }
}