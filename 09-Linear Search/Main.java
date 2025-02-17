public class Main {
    public static void main(String[] args) {
        int [] arr = {23, 45, 19, -3, 1, 2, 95,};
        int target = 19;
        boolean ans = linearSearch3(arr, target);
        System.out.println(ans);
    }

    // search in the array: return the index if item found
    static int linearSearch (int[] arr, int target ) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = 0; index < arr.length;index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }

     // search in the array: return the element if item found
     static int linearSearch2 (int[] arr, int target ) {
        if (arr.length == 0) {
            return -1;
        }
        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }
        return -1;
    }

     // search the target and return true or false
     static boolean linearSearch3 (int[] arr, int target ) {
        if (arr.length == 0) {
            return false;
        }
        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }
        return false;
    }

}