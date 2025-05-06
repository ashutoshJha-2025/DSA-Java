import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no.of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter no. of cols: ");
        int cols = sc.nextInt();

        int [][] matrix = new int[rows][cols];
        for (int i= 0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                matrix [i][j] = sc.nextInt();
            }
        }
         System.out.println();
        // To print transpose
        System.out.println("The transpose of a matrix is:- s");
        for (int j= 0; j<cols; j++) {
            for (int i=0; i<rows; i++) {
               System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }
        
    
    }
}
