import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your roll no.: ");
        int rollno = input.nextInt();
        System.out.println("Your roll number is " + rollno);

        System.out.print("Please enter your name: ");
        String name = input.next();
        System.out.println("Your name is " + name);

        System.out.print("Please enter your marks: ");
        float marks = input.nextFloat();
        System.out.println("Your marks are " + marks);

        input.close(); // Close the scanner to prevent resource leaks
        // Note: It's a good practice to close the scanner when you're done using it.
    }
}
