public class substr {
    public static void main(String[] args) {
        String s = "abcdef";
        System.out.println(s.substring(2, 4));
        System.out.println(s.substring(2));

        
        String b = "Physics";
        for (int i = 2; i < 4; i++) {
            System.out.print(b.substring(i));
        }
    }
}
