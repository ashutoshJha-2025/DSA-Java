package Trie;

public class wordBreak extends SearchInTrie {
    public static void main(String[] args) {
        String[] words = { "i", "like", "sam", "samsung", "mobile" };
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
        String key = "ilikesamsung";
        System.out.println(isWordBreakPossible(key));
    }

    public static boolean isWordBreakPossible(String key) {
        if (key.length() == 0) {
            return true;
        }

        for (int i = 1; i <= key.length(); i++) {
            String firstPart = key.substring(0, i);
            String secondPart = key.substring(i);
            if (search(firstPart) && isWordBreakPossible(secondPart)) {
                return true;
            }
        }
        return false;
    }
}
