import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Explicit Type casting 
        int castedNum = (int) 67.56f; 
        System.out.println("Casted number: " + castedNum);

        // Implicit type casting
        char num = 67; // Implicit type casting
        System.out.println("Character representation: " + num);

        input.close(); 
    }
}
