public class ReverseTheArray {
    public static void main(String[] args) {
        int[] arr = {11, 28, 3, 45, 59};

        System.out.print("The given Array is: ");
        for(int i=0; i<=arr.length-1; i++) {
            System.out.print(arr[i]+" ");
        }

        System.out.println();


        System.out.print("The reversed Array is: ");
        for(int i=arr.length-1; i>=0; i--) {
            System.out.print(arr[i]+" ");
        }
    }
}
