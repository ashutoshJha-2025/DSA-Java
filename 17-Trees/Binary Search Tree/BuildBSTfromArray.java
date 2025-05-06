public class BuildBSTfromArray {
    static class Node {
        int val;
        Node right;
        Node left;

        Node(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        int values[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        display(root);
    }

    private static Node insert(Node root, int val) {
        if (root==null) {                                      //             5
            root = new Node(val);                              //           /   \
            return root;                                       //          1     7
        }                                                      //           \
        if (root.val > val) {                                  //            3
            root.left = insert(root.left, val);                //           /  \
        }else {                                                //          2     4
            root.right = insert(root.right, val);  
        }
        return root;
    }

    // This display function is based on Inorder Traversal (Left,Root, Right), because Inorder Traversal gives sorted order in BST
    public static void display(Node root) {
        if (root == null)
            return;
        display(root.left);
        System.out.print(root.val + " ");
        display(root.right);
    }
}
