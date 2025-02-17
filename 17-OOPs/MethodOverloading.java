// *To achieve method overloading the return type of the function should be same, but only parameters be different;*
public class MethodOverloading {
    public static void main(String[] args) {
        Greet obj = new Greet();
        obj.Greetings();
        obj.Greetings("Ashutosh");
        obj.Greetings(18);
        obj.Greetings(81.50f);
        obj.Greetings("English",60f);
        obj.Greetings("Anurag", 3);
    }
}


class Greet {

    void Greetings() {
        System.out.println("Hello, Good Morning.");
    }

    void Greetings(String name) {
        System.out.println("Hello "+name+" ,Good Morning.");
    }

    void Greetings(int age) {
        System.out.println("I am "+age+" years old.");
    }

    void Greetings(float marks) {
        System.out.println("I got "+marks+" percentage in my 12th boards.");
    }

    void Greetings(String subject, float marks) {
        System.out.println("In "+subject+" i got only "+marks+" percetage.");
    }

    void Greetings(String name,int count) {
        for(int i=0; i<count; i++) {
            System.out.println("Hello "+name+" you are my best friend.");
        }
    }
}