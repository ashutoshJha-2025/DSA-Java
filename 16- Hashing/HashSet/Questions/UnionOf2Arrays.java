package Questions;
import java.util.*;

public class UnionOf2Arrays {
    public static void main(String[] args) {
        int arr1 [] = {7,3,9};
        int arr2 [] = {6,3,9,2,9,4}; 
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<arr1.length; i++) {
            set.add(arr1[i]);
        }
        for(int j=0; j<arr2.length; j++) {
            set.add(arr2[j]);
        }

        System.out.println("Size of Union array :" + set.size());
        System.out.println(set);
    }
}
