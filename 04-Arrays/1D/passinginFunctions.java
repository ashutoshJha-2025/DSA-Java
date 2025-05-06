import java.util.Arrays;
// Arrays are mutable in java
public class passinginFunctions {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 12};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void change(int[] arr) {
        arr[0] = 99;
    }
}
