package Questions;

public class ReverseEachString {
    public static void main(String[] args) {
        String str = "I am an educator";
        StringBuilder sb = new StringBuilder();
        String ans = "";

        for (int i = 0; i < str.length(); i++) {
            char ch =  str.charAt(i);
            if (ch != ' ') {
                sb.append(ch);
            } else {
                sb.reverse();
                ans += sb;
                ans += " ";
                sb = new StringBuilder("");
            }
        }
        sb.reverse();
        ans += sb;
        System.out.println(ans);
    }
}
