public class SumSizeMaxHeight {
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
        System.out.println(size(root));
        System.out.println(sum(root));
        System.out.println(max(root));
        System.out.println(height(root));
    }
    
    // Size of a tree || no. of elements in a tree
    public static int size(Node root) {
        if (root == null) return 0;
        return 1 + size(root.left) + size(root.right);
    }

    // Sum of all the nodes in a tree
    public static int sum(Node root) {
        if(root == null) return 0;
        return root.val + sum(root.left) + sum(root.right);
    }

    // Max value of a node in a tree
    public static int max(Node root) {
        if(root == null) return Integer.MIN_VALUE;
        int a = root.val;
        int b = max(root.left);
        int c = max(root.right);
        return Math.max(a, Math.max(b, c));
    }

    // Height of a binary tree
    public static int height(Node root) {
        if(root == null || (root.left==null && root.right==null)) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }
    
}    