package Final.Strings;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "abbccda";
        removeDuplicates(str, 0, "");
    }

    public static boolean[] map = new boolean[26];

    public static void removeDuplicates(String str, int idx, String newString) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }

        char ch = str.charAt(idx);
        if (map[ch - 'a'] == true) {
            removeDuplicates(str, idx+1, newString);
        } else {
            newString += ch;
            map[ch - 'a'] = true;
            removeDuplicates(str, idx+1, newString);
        }
    }
}
