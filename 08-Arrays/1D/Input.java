import java.util.Scanner;

public class Input {

    /* syntax:-
       datatype [] array name = new datatype[size];    int [] arr = new int[3];
       datatype [] array name = {         };           int [] marks = {86, 89, 83};
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[3];
        arr[0] = 23;
        arr[1] = 45;
        arr[2] = 233;
        System.out.println(arr[3]);

        // Input using for loops
        for (int i = 0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
            System.out.print(arr[i] + " ");
        }
    }
}
