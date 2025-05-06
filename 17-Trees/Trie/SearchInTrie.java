package Trie;

public class SearchInTrie extends creatingTrieandInsert {
    public static void main(String[] args) {
        String[] words = { "the", "a", "there", "their", "any" };
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
        System.out.println(search("the"));
        System.out.println(search("an"));
    }

    public static boolean search(String target) {
        Node curr = root;
        for (int i = 0; i < target.length(); i++) {
            int idx = target.charAt(i) - 'a';
            Node node = curr.children[idx];

            if ((node == null) || (i == target.length() - 1 && node.eow == false)) {
                return false;
            }

            curr = node;
        }
        return true;
    }
}
