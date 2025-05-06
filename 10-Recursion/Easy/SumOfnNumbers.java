package Final.Easy;

public class SumOfnNumbers {
    public static void main(String[] args) {
        int ans = printSum(5);
        System.out.println(ans);
    }

    static int printSum(int n) {
        if(n <= 1) {
            return 1;
        }

        return n + printSum(n-1);


    }
}
