// what will be the output of this code.

public class Question5 {
    public static void main(String [] args) {
        Vehicle v = new Car();
        v.print();
        Vehicle c = new Vehicle();
        c.print();
    }
}

class Vehicle {
    void print() {
        System.out.println("Base class(Vehicle)");
    }
}
class Car extends Vehicle {
    void print() {
        System.out.println("Derived calss(Car)");
    }
}