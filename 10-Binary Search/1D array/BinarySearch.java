public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89}; // array is in ascending order.
        int target = 22;
        int ans = binarysearch(arr, target);
        System.out.println(ans);
    }

    // return the index
    static int binarysearch(int[] arr, int target) {
        if (target > arr[arr.length - 1]) {
            return -1;
        }
        int start =0;
        int end = arr.length-1;

        while(start <= end) {
            // find the middle element
            int mid = start + (end -start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if(target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }
}