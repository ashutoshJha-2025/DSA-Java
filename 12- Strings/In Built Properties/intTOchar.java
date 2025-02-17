public class intTOchar {
    public static void main(String[] args) {
        // String str = "abc";
        // str += "xyz";
        // str += 'r';
        // str += 10;
        // str += 20;
        // System.out.println(str);

        System.out.println("abc" + 10 + 20);   // abc1020
        System.out.println("abc" + (10 + 20)); // abc30
        System.out.println(10 + 20 + "abc");   // 30abc
    }
}
