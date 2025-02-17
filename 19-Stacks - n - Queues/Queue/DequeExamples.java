package Queue;

import java.util.*;

public class DequeExamples {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(89);
        deque.addFirst(78);
        System.out.println(deque.removeFirst());
    }
}
