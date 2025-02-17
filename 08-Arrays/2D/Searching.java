import java.util.Scanner;

public class Searching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = {
            {1, 2, 3, 4},
            {5, 6, 45, 59},
            {7, 8, 9, 47}
    };

    System.out.print("Enter any number X: ");
    int X = sc.nextInt();

        for(int i = 0; i<arr.length; i++) {
            for (int j=0; j<arr[i].length; j++) {
                if(arr[i][j] == X) {
                    System.out.println("X found at location (" + i + "," + j +")");
                }
            } 
        }


    }
}
