// BEFORE REACHING THIS QUESTION LEARN MOUNTAIN ARRAY AND ORDER AGNOBS
public class SearchInMountain {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 4, 3, 2};
        int target = 3;
        int ans1 = peakIndexInMountainArray(arr);
        System.out.println("The peak element in the mountain array is at index: "+ ans1);
        search(arr, target);
    }
   
    static void search(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);
        // Searching in first half
        int firstTry = orderAgnosticBS(arr, target, 0, peak);
        
        // try to search in second half
        int secondTry = orderAgnosticBS(arr, target, peak+1, arr.length - 1);

        System.out.println("Target found at index: " + firstTry +", " +secondTry);
    }




     static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid+1]) {
                end = mid;
            } else {  
                start = mid + 1;
            }
        }
        return start;
    }




    static int orderAgnosticBS(int[] arr, int target, int start, int end) {
        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];
        while(start <= end) {
            // find the middle element
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }






}