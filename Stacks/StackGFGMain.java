package CollectionFramwork.Stack;

import java.util.ArrayDeque;
import java.util.Stack;

public class StackGFGMain {
    public static void main(String[] args) {
        //Stack<Integer> stack = new Stack<>();
        ArrayDeque<Integer>stack = new ArrayDeque<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
    }
}
