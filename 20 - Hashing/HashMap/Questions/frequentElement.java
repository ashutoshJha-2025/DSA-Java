package Questions;
import java.util.*;
public class frequentElement {
    // Given an array return the most frequent element
    public static void main(String[] args) {
        int[] arr = {1,3,2,1,4,1};
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int element : arr) {
            if (!freq.containsKey(element)) {
                freq.put(element, 1);
            }else {
                freq.put(element, freq.get(element)+1);
            }
        }

        int maxFreq = 0, ansKey = -1;
        for (int key : freq.keySet()) {
            if (freq.get(key) > maxFreq) {
                maxFreq = freq.get(key);
                ansKey = key;
            }
        }
        System.out.println(ansKey+" has max frequency and it occurs "+maxFreq+" times");
    }
}
