public class Traversals {
    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }
    public static void main(String[] args) {
        Node root = new Node(2);                    //        2
        Node a = new Node(4);                       //      /   \ 
        Node b = new Node(10);                      //     4     10
        root.left = a;                              //   /   \     \
        root.right = b;                             //  6     5     11
        Node c = new Node(6);
        Node d = new Node(5);
        a.left = c;
        a.right = d;
        Node e = new Node(11);
        b.right = e;

        //preOrder(root);
        //inOrder(root);
        //postOrder(root);
        int level = height(root) + 1;
        for (int i = 1; i <= level; i++) {
            nthLevel(root, i);
            System.out.println();
        }
    }

    
    
    // 1.Pre-Order Traversal on a tree & print all the elements in a tree
    public static void preOrder(Node root) {
        // PreOrder is root -> left -> right
        if(root == null) return;
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    // 2.Inorder Traversal
    public static void inOrder(Node root) {
        // Inorder is left -> root -> right
        if(root==null) return;
        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);
    }

    // 3.Postorder Traversal
    public static void postOrder(Node root) {
        // Postorder is left -> right -> root
        if(root==null) return;
        inOrder(root.left);
        inOrder(root.right);
        System.out.print(root.val+" ");
    }

    // nth Level Traversal
    public static void nthLevel(Node root, int n) {
        if(root == null) return;
        if(n==1) {
            System.out.print(root.val+" ");
            return;
        }
        nthLevel(root.left, n-1);
        nthLevel(root.right, n-1);
    }
    public static int height(Node root) {
        if(root == null || (root.left==null && root.right==null)) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }
}
