package BST;

public class PrintinRange extends BuildBST {
    public static void main(String[] args) {
        Node root = new Node(5);                           //         5
        Node a = new Node(1);                              //       /   \        
        Node b = new Node(7);                              //      1     7
        root.left = a;                                    //        \
        root.right = b;                                   //         3
        Node c = new Node(3);                             //       /   \ 
        a.right = c;                                      //      2     4
        Node d = new Node(2);
        Node e = new Node(4);
        c.left = d;
        c.right = e;

        print(root, 1, 3);
    }

    private static void print(Node root, int x, int y) {
        if(root == null) return;
        if(root.val >= x && root.val <= y) {
            print(root.left, x, y);
            System.out.print(root.val+" ");
            print(root.right, x, y);
        }else if (root.val >= y) {
            print(root.left, x, y);
        }else {
            print(root.right, x, y);
        }
    }
}
