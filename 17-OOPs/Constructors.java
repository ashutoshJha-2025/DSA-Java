// *The name of the constructor should be the same as the class*;
// *A java constructor must not have a return type*;

public class Constructors {
    public static void main(String[] args) {
        Complex num1 = new Complex();                      // Object
        Complex num2 = new Complex(4,1);     // Object
        Complex num3 = new Complex(8);                  // Object
        num1.print();
        num2.print();
        num3.print();

        Complex result = num1.add(num2);
        result.print();
    }
}


class Complex {
    int a,b;     // Property

    //   Default Constructor
    public Complex() {       
        a = 5;
        b = 3;
    }

    //   Manual Constructor
    public Complex(int real, int imaginary) {
        a = real;
        b = imaginary;
    }

    public Complex(int real) {
        a = real;
        b = 13;
    }

    void print() {
        System.out.println(a+" + "+b+"i" );
    }

    Complex add(Complex num2) {
        Complex newNum = new Complex(a+num2.a, b+num2.b);
        return newNum;
    }
}