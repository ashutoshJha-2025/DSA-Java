public class deletion {
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

        tree.delete(tree.root, 60);
        /*  Tree structure after deleting 60:
         *               48
         *             /     \
         *           33       58
         *          /  \     /  
         *        30   40   50
         *       /    /  \
         *      25   35   42
        */

        tree.delete(tree.root, 30);
        /*  Tree structure after deleting 30:
         *              48
         *            /     \
         *          33       58
         *         /  \     /  
         *       25   40   50
         *           /  \
         *         35   42
        */

        tree.delete(tree.root, 33);
        /*  Tree structure after deleting 33:
         *              48
         *            /     \
         *          35       58
         *         /  \     /  
         *       25   40   50
         *             \
         *             42
        */
    }
}