public class PascalTriangle {
    public static void main(String[] args) {

        // Convert from 1-based Pascal-triangle positions to 0-based nCr inputs.
        int row = 7, col = 4;
        System.out.println(nCombinationr(row - 1, col - 1));

        printNthRow(4);

        printPascalTriangle(row);
    }

    /**
     * Question 1
     * Returns the value at a Pascal-triangle position using the binomial
     * coefficient nCr. The caller supplies zero-based n and r values.
     */
    private static int nCombinationr(int n, int r) {
        int res = 1;

        // Build nCr one factor at a time, dividing at each step to keep
        // intermediate values smaller.
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return res;
    }

    /**
     * Question 2
     * Prints the requested row of Pascal's triangle, with rows numbered from 1.
     */
    private static void printNthRow(int row) {
        int ans = 1;
        System.out.print(ans + " ");

        // Each value is calculated from the previous value in the row.
        for (int col = 1; col < row; col++) {
            ans = ans * (row - col) / col;
            System.out.print(ans + " ");
        }
    }

    /**
     * Question 3
     * Prints rows 1 through lastRow - 1 of Pascal's triangle.
     */
    private static void printPascalTriangle(int lastRow) {
        for (int i = 1; i < lastRow; i++) {
            printNthRow(i);
            System.out.println();
        }
    }
}