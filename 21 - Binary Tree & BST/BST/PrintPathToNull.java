package BST;
import java.util.*;

public class PrintPathToNull {
    static class Node{
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
        root.left = a;                                    //     /   \
        root.right = b;                                   //    0     3
        Node c = new Node(3);                             //       /   \ 
        a.right = c;                                      //      2     4
        Node d = new Node(2);
        Node e = new Node(4);
        Node f = new Node(0);
        a.left = f;
        c.left = d;
        c.right = e;
        ArrayList<Integer> arr = new ArrayList<>();
        path(root, arr);
    }

    public static void path(Node root,ArrayList<Integer> arr ) {
        if (root.left==null && root.right==null) {
            arr.add(root.val);
            print(arr);
            arr.remove(arr.size() - 1);
            return;
        }
        arr.add(root.val);
        path(root.left, arr);
        path(root.right, arr);
        arr.remove(arr.size() - 1);
    }

    private static void print(ArrayList<Integer> arr) {
        for(int i=0; i<arr.size(); i++) {
            System.out.print(arr.get(i)+" -> ");
        }
        System.out.print("NULL");
        System.out.println();
    }
}
