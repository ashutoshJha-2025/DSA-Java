package Final.Strings;

public class SkipAChar {
    public static void main(String[] args) {
        skip("", "baccdah");
    }

    static void skip(String ans, String letter) {
        if(letter.isEmpty()) {
            System.out.println(ans);
            return;
        }

        char ch = letter.charAt(0);

        if(ch == 'a') {
            skip(ans, letter.substring(1));
        } else {
            skip(ans + ch , letter.substring(1));
        }
    }
}
