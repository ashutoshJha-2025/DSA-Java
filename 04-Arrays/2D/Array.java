import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        //type [][] array name = new type [rows][columns];
        //int [][] numbers = new int [3][5];

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter no. of columns: ");
        int columns = sc.nextInt();

        int [][] numbers = new int[rows][columns];
        //input
        //rows
        for(int i=0; i<rows; i++) {
            //columns
            for(int j=0; j<columns; j++) {
                numbers [i][j] = sc.nextInt();
            }
        }

        //output
        for(int i=0; i<rows; i++) {
            for(int j=0; j<columns; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
        


        
        
    }
}
