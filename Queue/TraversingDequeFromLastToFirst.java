package CollectionFramwork.Queue;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class TraversingDequeFromLastToFirst {
    public static void main(String[] args) {
        Deque<Integer> deq = new LinkedList<>();
        deq.addFirst(10);
        deq.addFirst(20);
        deq.addFirst(5);
        deq.addFirst(15);

        Iterator it = deq.descendingIterator();
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }
}
