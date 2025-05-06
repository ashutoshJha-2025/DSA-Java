import java.util.*;
public class currencyConversion{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // INR to USD conversion
        System.out.print("Amount in INR: ");
        double INR = sc.nextDouble();
        double USD = INR * 0.012; 
        System.out.println("Amount in USD: " + USD);

        // USD to INR conversion
        System.out.print("Amount in USD: ");
        double USD1 = sc.nextDouble();
        double INR1 = USD1 * 83.67; 
        System.out.println("Amount in INR: " + INR1);

        sc.close();
    }
}