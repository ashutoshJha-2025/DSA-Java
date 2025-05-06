// Q: print all three digit armstrog numbers

public class Armstrongnumbers {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }

    private static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;
        
        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem*rem*rem;
        }
        return sum == original;
    }
 }

