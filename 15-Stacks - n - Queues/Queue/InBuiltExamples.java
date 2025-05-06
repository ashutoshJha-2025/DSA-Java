package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class InBuiltExamples {
    public static void main(String[] args) {
    Queue<Integer> queue = new LinkedList<>();
    queue.add(3);                          // 1
    queue.add(6);                          // 2 
    queue.add(5);                          // 3
    queue.add(19);                         // 4
    queue.add(1);                          // 5 

    System.out.println(queue.remove());      // 1 
    System.out.println(queue.remove());      // 2       FIFO = first in first out
    System.out.println(queue.remove());      // 3  
    System.out.println(queue.remove());      // 4       LILO = last in last out
    System.out.println(queue.remove());      // 5
    
    
    }
}
