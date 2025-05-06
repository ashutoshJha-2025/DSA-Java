import java.util.*;

public class FibonacciExample {
    private static Map<Integer, Integer> memo = new HashMap<>();

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Fibonacci of " + n + " is: " + fibonacci(n));
    }

    // Memoization (Top-Down Approach)
    private static int fibonacci(int n) {
        if (n <= 1)
            return n;

        if (memo.containsKey(n)) {
            return memo.get(n);   // Return cached result if already computed
        }

        int result = fibonacci(n - 1) + fibonacci(n - 2);   // Recursive call
        memo.put(n, result);     // Store result in cache

        return result;
    }

    // Tabulation (Bottom-Up Approach)
    private static int fib(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        if (dp.length > 1)
            dp[1] = 1;
        for (int i = 2; i < dp.length; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
