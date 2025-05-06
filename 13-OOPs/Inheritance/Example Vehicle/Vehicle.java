public class Vehicle {
   
    // Property
    int wheelsCount;
    String model;
   
    // Behaviour
    void start() {
        System.out.println("Vehicle is starting");
    }

    // Default Constructor
    Vehicle() {
        System.out.println("Creating a vehicle instance");
    }

    // Parameterized Constructor
    Vehicle(int wheelsCount) {
        System.out.println("There are "+wheelsCount+" wheels in the vehicle");
    }
}