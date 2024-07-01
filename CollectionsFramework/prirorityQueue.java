package CollectionsFramework;

import java.util.Comparator;
import java.util.PriorityQueue;

public class prirorityQueue {
    public static void main(String[] args) {

        // Interally PriorityQueue apply Priority on minimum Value of Queue
        // By Default PriorityQueue Work like min Priority

       PriorityQueue pq = new PriorityQueue<>();

       pq.offer(40);
       pq.offer(12);
       pq.offer(24);
       pq.offer(36);

       System.out.println(pq);

       System.out.println(pq.poll());

       System.out.println(pq);

       System.out.println(pq.peek());

       PriorityQueue pq1 = new PriorityQueue<>(Comparator.reverseOrder());
       // Comparator.reverseOrder() -> It means Converting min priorityQueue to max PriorityQueue

       pq1.offer(40);
       pq1.offer(12);
       pq1.offer(24);
       pq1.offer(36);

       System.out.println(pq1);

       System.out.println(pq1.poll());

       System.out.println(pq1.peek());

    }
}
