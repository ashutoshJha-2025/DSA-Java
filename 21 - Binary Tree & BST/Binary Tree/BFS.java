import java.util.*;
public class BFS {
    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }
    public static void main(String[] args) {        //         2
        Node root = new Node(2);                    //       /   \
        Node a = new Node(4);                       //      /     \ 
        Node b = new Node(10);                      //     4       10
        root.left = a;                              //   /   \    /   \
        root.right = b;                             //  6     5 19      11
        Node c = new Node(6);
        Node d = new Node(5);
        a.left = c;
        a.right = d;
        Node e = new Node(11);
        Node f = new Node(19);
        b.right = e;
        b.left = f;

        bfs(root);
    }

    public static void bfs(Node root) {
        Queue<Node> q = new LinkedList<>(); 
        if(root!=null) q.add(root);
        while (q.size()>0) {
            Node temp = q.peek();
            if (temp.left!=null) q.add(temp.left);
            if (temp.right!=null) q.add(temp.right);
            System.out.print(temp.val+" ");
            q.remove();
        }
    }
}
