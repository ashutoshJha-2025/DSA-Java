public class ExamplePen {
    public static void main(String[] args) {
        pen pen1 = new pen();
        pen1.color = "blue";
        pen1.type = "gel";

        pen pen2 = new pen();
        pen2.color = "black";
        pen2.type = "ball";

        pen1.printcolor();
        pen2.printcolor();
        pen1.write();
    }
}


class pen {
    String color;
    String type;  //ball; gel
    
    public void write() {
        System.out.println("writing something");
    }

    public void printcolor() {
        System.out.println(this.color);
    }
}