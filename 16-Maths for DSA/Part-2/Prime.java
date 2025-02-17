import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();
        System.out.println(isPrime(n));

        // for (int i = 1; i<=n; i++) {
        //     System.out.println(i + " " + isPrime(i));
        // }
    }

    public static boolean isPrime(int n) {
        if(n == 1) {
            return false;
        }

        for(int i=2; i<n; i++) {
            if(n % i == 0) {
                return false;
            } 
        }
        return true;


    }
}