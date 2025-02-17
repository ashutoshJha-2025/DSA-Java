package Final.Arrays;
import java.util.ArrayList;

public class Find {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 4, 4, 5};
        System.out.println(findTarget(arr,4, 0));        
        System.out.println("Target found at index: "+findIndex(arr, 4, 0));

        findAllIndex(arr, 4, 0);
        System.out.println(list);

        ArrayList<Integer> ans = findAllIndex(arr, 4, 0, new ArrayList<>());
        System.out.println(ans);
    }

    static boolean findTarget(int[] arr, int target, int index) {
        if(index == arr.length) {
            return false;
        }
        return arr[index] == target || findTarget(arr, target, index + 1);
    }

    static int findIndex(int[] arr, int target, int index) {
        if(index == arr.length) {
            return -1;
        }
        if(arr[index] == target) {
            return index;
        } else {
            return findIndex(arr, target, index + 1);
        }
    }

    // Taking arraylist outside the function
    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int index) {
        if(index == arr.length) {
            return;
        }
        if(arr[index] == target) {
            list.add(index);
        } 
        findAllIndex(arr, target, index + 1);
    }


    // Taking arraylist in the argument
    static ArrayList findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list1) {
        if(index == arr.length) {
            return list1;
        }
        if(arr[index] == target) {
            list1.add(index);
        } 
        return findAllIndex(arr, target, index + 1, list1);
    }
}

