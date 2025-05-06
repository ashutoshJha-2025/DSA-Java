public class AVL {
    class Node {
        int val, height;
        Node left, right;

        Node(int d) {
            val = d;
            height = 1;
        }
    }

    Node root;

    int height(Node N) {
        if (N == null)
            return 0;
        return N.height;
    }

    int max(int a, int b) {
        return (a > b) ? a : b;
    }

    Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        // Perform rotation
        x.right = y;
        y.left = T2;

        // Update heights
        y.height = max(height(y.left), height(y.right)) + 1;
        x.height = max(height(x.left), height(x.right)) + 1;

        // Return new root
        return x;
    }

    Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        // Perform rotation
        y.left = x;
        x.right = T2;

        // Update heights
        x.height = max(height(x.left), height(x.right)) + 1;
        y.height = max(height(y.left), height(y.right)) + 1;

        // Return new root
        return y;
    }

    int getBalance(Node N) {
        if (N == null)
            return 0;
        return height(N.left) - height(N.right);
    }

    Node minValueNode(Node node) {
        Node current = node;

        // Loop down to find the leftmost leaf
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }

    public void preOrder(Node node) {
        if (node != null) {
            System.out.print(node.val + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    // Insertion function
    public Node insert(Node node, int key) {
        if (node == null) {
            return new Node(key);
        }
        if (key < node.val) {
            node.left = insert(node.left, key);
        } else if (key > node.val) {
            node.right = insert(node.right, key);
        } else {
            return node;
        }

        node.height = 1 + max(height(node.left), height(node.right));

        int balanceFactor = getBalance(node);

        // Case 1: Left-Left (LL) Rotation
        if (balanceFactor > 1 && key < node.left.val) {
            return rightRotate(node);
        }

        // Case 2: Right-Right (RR) Rotation
        if (balanceFactor < -1 && key > node.right.val) {
            return leftRotate(node);
        }

        // Case 3: Left-Right (LR) Rotation
        if (balanceFactor > 1 && key > node.left.val) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // Case 4: Right-Left (RL) Rotation
        if (balanceFactor < -1 && key < node.right.val) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }
        return node;
    }

    // Deletion function
    public Node delete(Node node, int key) {
        if (node == null) {
            return node;
        }

        if (key < node.val) {
            node.left = delete(node.left, key);
        } else if (key > node.val) {
            node.right = delete(node.right, key);
        } else {
            // Node with only one child or no child
            if ((node.left == null) || (node.right == null)) {
                Node temp = (node.left != null) ? node.left : node.right;

                // No child case
                if (temp == null) {
                    temp = node;
                    node = null;
                } else { // One child case
                    node = temp;
                }
            } else {
                // Node with two children: Get the inorder successor (smallest in the right
                // subtree)
                Node temp = minValueNode(node.right);

                // Copy the inorder successor's data to this node
                node.val = temp.val;

                // Delete the inorder successor
                node.right = delete(node.right, temp.val);
            }
        }

        // If the tree had only one node then return
        if (node == null) {
            return node;
        }

        // Update the height of the current node
        node.height = 1 + Math.max(height(node.left), height(node.right));

        // Get the balance factor
        int balance = getBalance(node);

        // If the node becomes unbalanced, then there are 4 cases

        // Left Left Case
        if (balance > 1 && getBalance(node.left) >= 0) {
            return rightRotate(node);
        }

        // Left Right Case
        if (balance > 1 && getBalance(node.left) < 0) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // Right Right Case
        if (balance < -1 && getBalance(node.right) <= 0) {
            return leftRotate(node);
        }

        // Right Left Case
        if (balance < -1 && getBalance(node.right) > 0) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    // Search
    public boolean search(Node root, int target) {
        if (root==null) return false;
        if (target < root.val) {
            return search(root.left, target);
        }else if (root.val == target) {
            return true;
        }else {
            return search(root.right, target);
        }
    }
}
