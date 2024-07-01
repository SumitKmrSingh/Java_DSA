package CollectionFramwork.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeImplementions {
    public static void main(String[] args) {
        Deque<Integer> q = new ArrayDeque<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);
        q.offer(6);
        q.offer(7);
        q.offer(8);
        q.offer(9);
        q.offer(10);
        q.add(11);

//        System.out.println(q.remove());     // If Deque/Queue Is empty It will throw an Exceptions
//        System.out.println(q.removeFirst());   // If Deque/Queue Is empty It will throw an Exceptions
//        System.out.println(q.removeLast());     // If Deque/Queue Is empty It will throw an Exceptions

        System.out.println(q);
        System.out.println("Poll : "+q.poll());
        System.out.println("PollFirst : "+q.pollFirst());;
        System.out.println("PollLast : "+q.pollLast());
        System.out.println("Peek : "+q.peek());
        System.out.println("PeekFirst : "+q.peekFirst());
        System.out.println("PeekLast : "+q.peekLast());
        System.out.println(q);
    }
}
