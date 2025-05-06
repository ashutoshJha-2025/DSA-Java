package Questions;
import java.util.*;
public class isomorphicString {
    public static void main(String[] args) {
        String s1 = "egg";
        String s2 = "add";
        System.out.println(isIsomorphic(s1, s2));
    }

    private static boolean isIsomorphic(String s1, String s2) {
        HashMap<Character, Character> map = new HashMap<>() ;
        for (int i = 0; i < s1.length(); i++) {
            char s1Ch = s1.charAt(i);
            char s2Ch = s2.charAt(i);

            if (map.containsKey(s1Ch)) {
                if (map.get(s1Ch) != s2Ch) {
                    return false;
                }
            }else if (map.containsValue(s2Ch)) {
                return false;
            }else {
                map.put(s1Ch, s2Ch);
            }
        }
        return true;
    }
}
