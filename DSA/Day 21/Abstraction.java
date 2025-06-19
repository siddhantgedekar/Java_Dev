public class Abstraction {
    public static void main(String [] args) {
        Horse h = new Horse();
        Chicken c = new Chicken();
        h.walk();
        h.eat();
        c.walk();
        c.eat();
        // we can't create an object of an 'Abstract class'.
        System.out.println(c.color);
        c.changeColor();
        System.out.println(c.color);
    }
}

abstract class Animal {
    String color;
    // initializing values
    // this will initialize the default values of color variable
    // everytime and object is created and color property called.
    Animal() {
        color = "brown";
        // if changeColor() method is called for any animal who has it, the value will change.
    }
    // non abstract method
    void eat() {
        System.out.println("animal eats");
    }
    // abstract method
    abstract void walk();
}

class Horse extends Animal {
    void changeColor() {
        color = "dark brown";
    }
    void walk() {
        System.out.println("Walks on four legs");
    }
}

class Chicken extends Animal {
    void changeColor() {
        color = "yellow";
    }
    void walk() {
        System.out.println("Walks on two legs");
    }
}