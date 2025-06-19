public class Inheritance {
    public static void main(String [] args) {
        Fish shark = new Fish();
        shark.eat();
        Dog dobby = new Dog();
        dobby.legs = 4;
    }
}

// 
class Animal {
    String color;
    // methods
    void eat() {
        System.out.println("Eats");
    }
    void breathe() {
        System.out.println("Breathing");
    }
}

class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("Swims");
    }
}

class Mamal extends Animal {
    //
    int legs;
}

class Dog extends Mamal {
    //
    String breed;
}