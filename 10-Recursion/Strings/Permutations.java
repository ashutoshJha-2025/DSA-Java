package Final.Strings;

public class Permutations {
    public static void main(String[] args) {
        printPerm("abc", "");
    }

    static void printPerm(String str, String permutation) {
        if (str.length()==0) {
            System.out.println(permutation);
            return;
        }
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            String newstr = str.substring(0, i) + str.substring(i+1);
            printPerm(newstr, permutation+ch);
        }
    }
}
