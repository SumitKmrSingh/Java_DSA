package CollectionsFramework;

import java.util.ArrayDeque;

public class LearnArrayDeque {
    public static void main(String[] args) {

        ArrayDeque<Integer> adq = new ArrayDeque<>();

        // offer() is the method of Queue Interface
        // It add the element from last In Queue
        adq.offer(12);  
        adq.offer(24);
        adq.offer(36);
        adq.offer(45);

        System.out.println(adq);

        // offerFirst() -> It is the method of ArrayDeque class.
        // It add the element from the first In queue.
        adq.offerFirst(46);
        System.out.println(adq);

        // offerLast() -> It is the method of ArrayDeque class.
        // It add the element from the last In queue.
        adq.offerLast(91);
        System.out.println(adq);

        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        System.out.println(adq.poll());
        System.out.println("poll() "+adq);

        System.out.println(adq.pollFirst());
        System.out.println("pollFirst() "+adq);

        System.out.println(adq.pollLast());
        System.out.println("pollLast() "+adq);
        

    }
    
}
