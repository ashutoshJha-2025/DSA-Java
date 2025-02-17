package Final.Easy;

public class Nto1 {
    public static void main(String[] args) {
      //  Print(5);
       // printRev(5);
       printBoth(5);
    }

    static void Print(int n)  {         // This function will print numbers from n to 1;
        if(n == 0) {
            return;
        }
        System.out.println(n);
        Print(n-1);
    }

    static void printRev(int n) {     // This function will print numbers from 1 to n;
        if (n == 0) {
            return;
        }
        printRev(n-1);
        System.out.println(n);
    }

    static void printBoth(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n+" ");
       
        printBoth(n-1);
       
        System.out.print(" "+n);
    }
}
