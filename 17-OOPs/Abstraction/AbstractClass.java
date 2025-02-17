package Abstraction;

public class AbstractClass {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.accelerate();
        c1.brake(4);
    }
    
}

abstract class Vehicle {        // We does not create the object of this abstract class;
    abstract void accelerate(); // The abstract method does not have a body;
    abstract int brake(int wheels);
    
    void honks() {                   // This method in abstraction means it is not compulsory to add this in our implementation.
        System.out.println("Vehicle honks");
    }
}

class Car extends Vehicle {

    @Override                // This "@Override" is simply check that the method name we have written is mentioned in parent class or not;
    void accelerate() {
        System.out.println("Car is accelerating");
       
    }

    @Override
    int brake(int wheels) {
        System.out.println("car brakes are pushed");
        return wheels;
    }

}
