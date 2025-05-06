package Trie;

public class startsWith extends creatingTrieandInsert {
    public static void main(String[] args) {
        String[] words = { "apple", "app", "mango", "man", "woman" };
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
        System.out.println(isStartsWith("app"));
        System.out.println(isStartsWith("moon"));
        System.out.println(isStartsWith("ap"));
    }

    public static boolean isStartsWith(String prefix) {
        Node curr = root;
        for (int i = 0; i < prefix.length(); i++) {
            int idx = prefix.charAt(i) - 'a';

            if (curr.children[idx] == null) {
                return false;
            }

            curr = curr.children[idx];
        }
        return true;
    }
}
