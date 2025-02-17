public class implementation {
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
        display(root);
        //preOrder(root);
    }

    // Display of a tree
    public static void display(Node root) {
        if(root == null) return;
        System.out.print(root.val+" -> "); 
        if(root.left!=null) System.out.print(root.left.val+"  ");
        if(root.right!=null) System.out.print(root.right.val);
        System.out.println();
        display(root.left);
        display(root.right);
    }

    // Pre-Order Traversal on a tree & print all the elements in a tree
    public static void preOrder(Node root) {
        if(root == null) return;
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
}