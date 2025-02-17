public class Main{
    public static void main(String[] args) {

        // Object
        Dog d1 = new Dog();
        d1.name = "Tommy";
        d1.bark();

        Dog d2 = new Dog();
        d2.name = "Leo";
        d2.walk();

        ComplexNumber num1 = new ComplexNumber();
        num1.a = 3;
        num1.b = 5;
        num1.print();
    }
}


class Dog {    // class

    // Properties
    String name;
    int age;
    String color;

    // behaviour
    void walk() {
        System.out.println(this.name +" is walking");
    }

    void bark() {
        System.out.println(name +" is barking");
    }
}


class ComplexNumber {
    int a, b;

    void print() {
        System.out.println(a+" + "+b+"i" );
    }
}