public class DeleteinBST {
    static class Node {
        int val;
        Node right;
        Node left;

        Node(int val) {
            this.val = val;
        }
    }
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

        delete(root, 2);
        display(root);
    }

    private static Node delete(Node root, int target) {
        if (root.val > target) {
            root.left = delete(root.left, target);
        }else if (root.val < target) {
            root.right = delete(root.right, target);
        }else {     // root.target == target

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


    private static void display(Node root) {
        if (root == null)
            return;
        display(root.left);
        System.out.print(root.val + " ");
        display(root.right);
    }
}