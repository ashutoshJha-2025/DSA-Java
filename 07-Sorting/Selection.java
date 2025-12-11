import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] arr = { 5, 8, 3, 1, 6 };
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);

            swap(arr, last, maxIndex);
        }
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int j = start; j <= end; j++) {
            if (arr[max] < arr[j]) {
                max = j;
            }
        }
        return max;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
