import java.util.Arrays;

public class variableArgs {
    public static void main(String[] args) {
        fun(2,3,56,84,98,45,60);
        multiple(2, 3, "Kunal", "Rahul", "dvytsbhusc");
        demo(5, 6, 7, 8, 9);
        demo("Kunal", "Rahul", "dvytsbhusc");
    }

    private static void demo(int... v) {
        System.out.println(Arrays.toString(v));
    }

    private static void demo(String... v) {
        System.out.println(Arrays.toString(v));
    }

    private static void multiple(int a, int b, String... v) {
        System.out.println(Arrays.toString(v));

    }

    private static void fun(int... v) {
        System.out.println(Arrays.toString(v));
    }
}
