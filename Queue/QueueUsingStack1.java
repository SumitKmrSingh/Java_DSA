package CollectionFramwork.Queue;

import java.util.Stack;

public class QueueUsingStack1 {
    Stack<Integer> st1 = new Stack<>();
    Stack<Integer> st2 = new Stack<>();

    public void enqueue(int val){

        // move all the elements from st1 to st2
        while(!st1.isEmpty()){
            st2.push(st1.pop());
        }

        // push the new elements In Stack
        st1.push(val);

        // move all the elements from st2 to st1
        while (!st2.isEmpty()){
            st1.push(st2.pop());
        }
    }

    // pop()
    public int dequeue(){
        if(st1.isEmpty()){
            System.out.println("Queue Is Empty");
            return -1;
        }
        int top = st1.pop();
        return top;
    }

    // Peek()
    public int peek(){
        if(st1.isEmpty()){
            System.out.println("Queue Is Empty");
            return -1;
        }
        int top = st1.peek();
        return top;
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
