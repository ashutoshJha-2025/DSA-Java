public class Car extends Vehicle {

    // Child Property
    String color;

    public static void main(String[] args) {
        Car obj = new Car();
        obj.wheelsCount = 4;
        obj.model = "Audi S20";
        obj.color = "Black";
        //obj.start();
    }


    // Method Overriding:- It means the name of the method we have created in child classis the same as that in parent class, but the return type of the method should be same in both the classes;
    void start() {
        System.out.println(this.model);
        System.out.println(this.wheelsCount);
        System.out.println(this.color);
        System.out.println("Car is running");
        super.start();       // Super keyword is use to access the method of immediate parent class;
    }

    // Child class Constructor;
    Car() {
        //super();                       // This super keyword is use to called the default constructor in parent class.
        super(4);           // While this is used to calles a parameterized constructor in parent class.
        System.out.println("Car is being created");
    }
}