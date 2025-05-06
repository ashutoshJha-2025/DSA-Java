// Leetcode:- 21: Merge two sorted Lists

public class Question2 extends Basic{
    public static Question2 merge(Question2 first, Question2 second) {
        Node f = first.head;
        Node s = second.head;

        Question2 ans = new Question2();
        while (f != null && s != null) {
            if (f.value < s.value) {
                ans.insertLast(f.value);
                f = f.next;
            } else {
                ans.insertLast(s.value);
                s = s.next;
            }
        }

        while (f != null) {
            ans.insertLast(f.value);
            f = f.next;
        }

        while (s != null) {
            ans.insertLast(s.value);
            s = s.next;
        }

        return ans;
    }


    public static void main(String[] args) {
        Question2 first = new Question2();
        Question2 second = new Question2();

        first.insertLast(1);
        first.insertLast(3);
        first.insertLast(5);

        second.insertLast(1);
        second.insertLast(2);
        second.insertLast(9);
        second.insertLast(14);

        Question2 ans = Question2.merge(first, second);
        ans.display();

        
    }
}
