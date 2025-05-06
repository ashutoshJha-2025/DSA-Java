package Final.Strings;

import java.util.ArrayList;

public class PhonePad {
    public static void main(String[] args) {
        //printComb("", "12");
        System.out.println(printComb1("", "12"));
    }



    static void printComb(String p,String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0);
        for(int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            printComb(p+ch, up.substring(1));
        }
    }

    static ArrayList<String> printComb1(String p,String up) {
        if (up.isEmpty()) {
           ArrayList<String> list = new ArrayList<>();
           list.add(p);
           return list;
        }
        int digit = up.charAt(0);

        ArrayList<String> list = new ArrayList<>();

        for(int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            list.addAll(printComb1(p+ch, up.substring(1)));
        }
        return list;
    }


}
