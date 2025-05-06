package Final.Easy;

public class Factorial {
    public static void main(String[] args) {
        int ans = Printfac(5);
        System.out.println(ans);
    }

    static int Printfac(int n) {
        if(n <= 1) {
            return 1;
        }

        return n*Printfac(n-1);


    }
}
