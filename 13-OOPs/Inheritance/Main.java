package Inheritance;

public class Main {
    public static void main(String[] args) {
       
        // circle obj = new circle();
        // obj.area(3);

        // triangle object = new triangle();
        // object.area(2, 6);

    }
}


class shape {
    public void area() {
        System.out.println("display area");
    }
}

class triangle extends shape{
    public void area(int l, int h) {
        System.out.println(1/2*l*h);
    }
}

class Equilateraltriangle extends triangle {
    public void area (int l, int h) {
        System.out.println(1/2*l*h);
    }
}

class circle extends shape {
    public void area(int r) {
        System.out.println(3.14*r*r);
    }
}

