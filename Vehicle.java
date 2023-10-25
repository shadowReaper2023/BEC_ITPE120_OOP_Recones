class Vehicle {
    Vehicle() {
        System.out.println("Vehicle constructor");
    }
}

class Car extends Vehicle {
    Car() {
        super(); // Calls the base class constructor
        System.out.println("Car constructor");
    }

    void display() {
        System.out.println("This is a car.");
    }
}

public class SuperDemo {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.display();
    }
}