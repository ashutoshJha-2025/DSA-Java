package Stringbuild;
public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("hello");
        
        // append: means to add the string
        str.append(" World");
       
        // setCharAt: means to change the char at a particular index
        // hello --> mello
        str.setCharAt(0, 'm');

        // insert
        // mello --> meyllo
        str.insert(2, 'y');

        // delete
        // meyllo --> mello
        str.deleteCharAt(2);
        //str.delete(2, 4);
       
        // reverse 
        str.reverse();
    }
}
