import java.util.*;
public class Basic {
    public static void main(String[] args) {
        // Syntax
        HashSet<String> set = new HashSet<>();

        // Adding a new element --> Hashset contains all unique elements
        set.add("James");
        set.add("Scott");
        set.add("Nidhi");

        // set contains or not
        System.out.println(set.contains("Nidhi"));   // True

        // Size of a set
        System.out.println(set.size());  // 3

        // Remove an element
        set.remove("James");

        System.out.println(set);
    }
}
