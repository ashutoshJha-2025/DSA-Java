package Final.Easy;

public class TowerOfHanoi {
    public static void main(String[] args) {
        transfer(2, "S", "H", "D");
    }

    static void transfer(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("transfer disk "+n+" from "+src+" to "+dest);
            return;
        }

        transfer(n-1, src, dest, helper);
        System.out.println("transfer disk "+n+" from "+src+" to "+dest);
        transfer(n-1, helper, src, dest);
    }
}
