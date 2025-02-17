import java.util.*;
public class Stringsbasics {
    public static void main(String[] args) {
        String s = "Ashutosh Jha";
        System.out.println(s);
        System.out.println(s.length());

      //  charAt function: is to get the char at index i from the given String
        System.out.println(s.charAt(7));

        //indexOf: is to get the index of the first occurence of the character from the String
        System.out.println(s.indexOf('s'));

       // comtainsOf:
        System.out.println(s.contains("h"));
        System.out.println(s.contains("shj"));

     //   startsWith:
        System.out.println(s.startsWith("Ash"));
        System.out.println(s.endsWith("ha"));

        // toLowercase, toUppercase:
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
    }
    
}