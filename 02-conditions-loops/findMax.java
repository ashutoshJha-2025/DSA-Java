import java.util.Scanner;
//  Q: Find the largest of the three numbers

public class findMax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        // Method
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println(max);

        int maxLibrary = Math.max(c,Math.max(a, b));
        System.out.println(maxLibrary);

        in.close();
    }
}
