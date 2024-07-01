package CollectionFramwork.Queue;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class TraversingDeque {
    public static void main(String[] args) {
        Deque<Integer> q = new LinkedList<>();
        q.addFirst(10);
        q.addFirst(20);
        q.addFirst(5);
        q.addFirst(15);

        System.out.println();

        // Method 1 (Using Iterator)
        Iterator it = q.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();

        // Method 2 (Using Iteration)
        for(int x : q){
            System.out.print(x+" ");
        }

    }
}
