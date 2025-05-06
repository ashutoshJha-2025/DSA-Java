package Final.Easy;

public class XPowerN {
    public static void main(String[] args) {
        System.out.println(calPower(2, 5));
    }

    static int calPower(int x, int n) {
        if (n == 0) {     // base case 1
            return 1;
        }
        if (x == 0) {     // base case 2
            return 0;
        }

        int xPownm1 = calPower(x, n-1);   // work
        int xpown = x * xPownm1;
        return xpown;
    }
}
