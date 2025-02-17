package Final.Strings;

public class SkipAString {
    public static void main(String[] args) {
        skipApple("", "bcadapplevs");
    }

    static void skipApple(String ans, String word) {
        if(word.isEmpty()) {
            System.out.println(ans);
            return;
        }

        char ch = word.charAt(0);
        
        if(word.startsWith("apple")) {
            skipApple(ans, word.substring(5));
        } else {
            skipApple(ans + ch , word.substring(1));
        }
    }
}
