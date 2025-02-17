package BST;

public class DeleteinBST extends BuildBST{
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

        delete(root, 3);
        inorder(root);
    }

    private static Node delete(Node root, int val) {
        if (root.val > val) {
            root.left = delete(root.left, val);
        }else if (root.val < val) {
            root.right = delete(root.right, val);
        }else {     // root.val == val

            // Case 1: No Child (Leaf Node)
            if (root.left==null && root.right==null) {
                return null;
            }

            // Case 2: One Child 
            if (root.left==null) {
                return root.right;
            }

            // Case 3: Two Child 
            Node IS = inorderSuccessor(root.right);
            root.val = IS.val;
            root.right = delete(root.right, IS.val);
        }   
        return root;
    }
            
    private static Node inorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }
}
