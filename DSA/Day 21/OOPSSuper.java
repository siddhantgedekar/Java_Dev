public class OOPSSuper {
    public static void main(String [] args) {
        Horse h = new Horse();
        
    }
}

class Animal {
    String color;
    Animal() {
        System.out.println("Animal constructor is called.");
    }
}

class Horse extends Animal {
    Horse() {
        super();
        System.out.println("Horse constructor is called");
    }
}