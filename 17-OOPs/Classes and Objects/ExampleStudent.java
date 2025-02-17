public class ExampleStudent {
    public static void main(String[] args) {
     Student s1 = new Student();
     s1.name = "aman";
     s1.age = 25;
     s1.marks = 90f;
     
     s1.printInfo();
    }
}


class Student {
    String name;
    int age;
    float marks;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    } 
}