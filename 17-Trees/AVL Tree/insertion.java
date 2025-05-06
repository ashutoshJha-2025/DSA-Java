public class insertion {
    public static void main(String[] args) {
       AVL tree = new AVL();

        /* The tree would look like this (unbalanced):
         *         10
         *           \
         *            20
         *           /  \
         *          25   30
         *                 \
         *                  40
         *                    \
         *                     50
        */

        int[] keys = { 10, 20, 30, 40, 50, 25 };
        for (int key : keys) {
            tree.root = tree.insert(tree.root, key);
        }

        System.out.println("Preorder traversal of the constructed AVL tree is:");   // 30 20 10 25 40 50
        tree.preOrder(tree.root);
        /* Final balanced AVL tree structure:
         *         30
         *       /    \
         *     20      40
         *    /  \       \
         *  10   25      50
        */
    }
}