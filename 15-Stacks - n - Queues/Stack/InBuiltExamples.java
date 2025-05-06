package Stack;

import java.util.Stack;

public class InBuiltExamples {
    public static void main(String[] args) {
    Stack<Integer> stack = new Stack<>();
    stack.push(34);                 // 1  
    stack.push(45);                 // 2
    stack.push(2);                  // 3
    stack.push(9);                  // 4
    stack.push(18);                 // 5

    System.out.println(stack.pop());     // 5
    System.out.println(stack.pop());     // 4        FILO = first in last out
    System.out.println(stack.pop());     // 3   
    System.out.println(stack.pop());     // 2        LIFO = last in first out
    System.out.println(stack.pop());     // 1
    
    }
}