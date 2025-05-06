package Questions;

import java.util.*;

public class Toggle {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("AsHuToSH  JHa");

        // toggle: AsHuToSH JhA
        for (int i = 0; i < str.length(); i++) {
            boolean flag = true; // true -> character capital hai
            char ch = str.charAt(i); // A
            if (ch == ' ') continue;
            int asci = (int)ch;   // 65

            if (asci >= 97) flag = false;

            if (flag == true) {  // means character capital hai
                asci += 32;
                char dh = (char)asci;
                str.setCharAt(i, dh);
            } else{
                asci -= 32;
                char dh = (char)asci;
                str.setCharAt(i, dh);
            }
        }

        System.out.println(str);
    }
}
