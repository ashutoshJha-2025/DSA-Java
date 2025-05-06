public class Factorial {
    public static void main(String[] args) {
        printFactorial(5); // 120
    }  

    public static void printFactorial(int n) {
        if (n < 0) {
            System.out.println("Invalid division");
            return;
        }
        int Factorial = 1;
        for (int i = n; i >= 1; i--) {
            Factorial = Factorial * i;
        }
        System.out.println(Factorial);
        return;
    }
}