public class search {
    public static void main(String[] args) {
        AVL tree = new AVL();

        /* 
         *               48
         *            /     \
         *          33       58
         *         /  \     /  \
         *       30   40   50   60
         *      /    /  \
         *    25   35   42
        */

        int[] keys = { 48, 33, 58, 30, 40, 50, 60, 25, 35, 42 };
        for (int key : keys) {
            tree.root = tree.insert(tree.root, key);
        }

        boolean ans= tree.search(tree.root, 40);
        System.out.println(ans);
    }
}
