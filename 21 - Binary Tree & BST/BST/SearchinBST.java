package BST;

public class SearchinBST extends BuildBST{
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

        System.out.println(search(root, 6));
    }

    private static boolean search(Node root, int target) {
        if (root==null) return false;
        if (target < root.val) {
            return search(root.left, target);
        }else if (root.val == target) {
            return true;
        }else {
            search(root.right, target);
        }
        return false;
    }
}
