import java.util.*;
public class app{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // INR to USD conversion
        // System.out.print("Amount in INR: ");
        // double INR = sc.nextDouble();
        // double USD = INR * 0.012; 
        // System.out.println("Amount in USD: " + USD);

        // USD to INR conversion
        System.out.print("Amount in USD: ");
        double USD = sc.nextDouble();
        double INR = USD * 83.67; 
        System.out.println("Amount in INR: " + INR);
    }
}