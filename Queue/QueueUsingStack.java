package CollectionFramwork.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueUsingStack {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public void enqueue(int val) {
        s1.push(val);
    }

    public int dequeue(){
        if(s1.isEmpty()){
            System.out.println("Queue Is Empty");
            return -1;
        }

        // move all the elements of s1 to s2
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }

        int val = s2.pop();
        // move all the elements of s2 to s1
        while (!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return val;
    }

    public int peek(){
        if(s1.isEmpty()){
            System.out.println("Queue Is Empty");
            return -1;
        }

        // move all the elements of s1 to s2
        while (!s1.isEmpty()){
            s2.push(s1.pop());
        }

        int val = s2.peek();

        // move all the elements of s2 to s1
        while (!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return val;
    }

    public static void main(String[] args) {
       // Queue<Integer> queue = new LinkedList<>();

        QueueUsingStack queue = new QueueUsingStack();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Peek Is : "+queue.peek());      // 1
        System.out.println("DEQUE Is : "+queue.dequeue());   // 1
        queue.enqueue(7);
        System.out.println("Peek Is : "+queue.peek());  // 2
    }
}
