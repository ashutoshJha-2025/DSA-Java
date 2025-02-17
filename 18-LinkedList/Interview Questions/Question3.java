// Leetcode:- 202: Happy Number

public class Question3 extends Basic {
    public static boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        } while (slow != fast);

        if (slow == 1) {
            return true;
        }

        return false;
    }

    private static int findSquare(int number) {
        int ans = 0;
        while (number > 0) {
            int remainder = number % 10;
            ans += remainder * remainder;
            number /= 10;
        }
        return ans;
    }

    public static void main(String[] args) {
       System.out.println(isHappy(68));
    }
}
