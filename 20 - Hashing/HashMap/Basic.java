import java.util.*;
public class Basic {
    public static void main(String[] args) {
        // Syntax
        //         Key, Value
        HashMap<String, Integer> map = new HashMap<>();

        // Adding Elements
        map.put("Akash", 21);
        map.put("Yash", 16);
        map.put("Luv", 17);
        map.put("Rishika", 85);
        map.put("Harry", 20);

        // Getting value of a key
        System.out.println(map.get("Akash"));   //21 --> key exist
        System.out.println(map.get("Rahul"));   //null  -->  key does not exist

        // Changing/Updating a value of a key
        map.put("Akash", 25);    // Akash = 25 --> if key exist it will update the value else it just add a new element
        System.out.println(map.get("Akash"));   //25

        // Remove a pair from the map
        map.remove("Akash");
        System.out.println(map.get("Akash")); // null

        // Checking if a key is exist in a map
        System.out.println(map.containsKey("Akash"));  // false  --> key does not exist
        System.out.println(map.containsKey("Yash"));   // true --> key exist

        // Adding a new entry only if a key doesn't exist
        map.putIfAbsent("Yashika", 30);  // will enter
        map.putIfAbsent("Yash", 30);     // will not enter

        // Get all the keys in the Hashmap
        System.out.println(map.keySet());

        // Get all the values in the Hashmap
        System.out.println(map.values());

        // Get all the entries in the Hashmap
        System.out.println(map.entrySet());

        // Traversing all entries of Hashmap
        for (String key : map.keySet()) {
            System.out.println("Age of "+key+" is "+map.get(key));
        }
    }
}