import java.util.*;
public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // For loop
        for (int i=1; i<=n; i+=2) {
            System.out.print(i+" ");
        }
        System.out.println();

        // While loop
        int i = 1;
        while (i <= n) {
            System.out.print(i+" ");
            i++;
        }
        System.out.println();

        // Do-while loop
        int j = 1;
        do {
            System.out.print(j+" ");
            j++;
        } while (j <= n);
        System.out.println();

        sc.close();
    }
}
