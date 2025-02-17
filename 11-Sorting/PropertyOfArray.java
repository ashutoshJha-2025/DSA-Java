public class PropertyOfArray {
    public static void main(String[] args) {

        //index no:-  0  1  2  3  4
        int [] arr = {3, 1, 5, 4, 2};

        System.out.print("Total number of elements in an array: ");
        System.out.println(arr.length);  //Here it will print number of elements in an array.

        System.out.print("Element at last position: ");
        System.out.println(arr[arr.length - 1]); //Here it will print element at index number 4 / element at last index.


        int i = 2;
        System.out.println(arr[arr.length - i - 1]); // Here it will print element at last index - ith index.
        System.out.println(arr[i]);
    }
}
