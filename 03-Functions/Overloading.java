public class Overloading {
    public static void main(String[] args) {
        int ans = sum(3, 4, 78);
        System.out.println(ans);
    }

    private static int sum(int a, int b) {
        return a + b;
    }

    private static int sum(int a, int b, int c) {
        return a + b + c;
    }

    private static void fun(int a) {
        System.out.println("first one");
        System.out.println(a);
    }

    private static void fun(String name) {
        System.out.println("Second one");
        System.out.println(name);
    }
}
