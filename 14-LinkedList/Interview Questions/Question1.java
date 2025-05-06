//Leetcode:- 83:Remove Duplicates from Sorted List;

public class Question1 extends Basic  {
    public static void main(String[] args) {
        Question1 list = new Question1();
        list.insertLast(1);
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(3);
        list.insertLast(3);

        list.display();
        System.out.println();
        list.duplicates();
        list.display();

    }

    public void duplicates() {
        Node node = head;

        while (node.next != null) {
            if (node.value == node.next.value) {
                node.next = node.next.next;
                size--;
            } else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }
}
