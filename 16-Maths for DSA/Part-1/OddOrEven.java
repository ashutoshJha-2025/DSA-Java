import java.util.*;
public class OddOrEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println(isOdd(n));
        Odd(n);
    }

    public static boolean isOdd(int n) {
        return (n & 1) == 1;
    } 

    public static void Odd (int n) {
        if(isOdd(n)) {
            System.out.println("The given number is odd.");
        } else {
            System.out.println("The given number is even.");
        }
    }
}