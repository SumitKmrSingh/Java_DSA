/* A deque is a double-ended queue that allows enqueue and dequeue operations from both the ends.

Given a deque and Q queries. The task is to perform some operation on dequeue according to the queries as
given below:
    1. pb: query to push back the element x.
    2. pf: query to push element x(given with query) to the front of the deque.
    3. pp_b(): query to delete element from the back of the deque.
    4. f: query to return a front element from the deque. */

package CollectionFramwork.Queue;

import java.util.ArrayDeque;

public class DequeImplementations {
    public static void push_back_pb(ArrayDeque<Integer> dq, int x) {
        // Your code here
        dq.offerLast(x);
    }

    // Function to pop element from back of the deque.
    public static void pop_back_ppb(ArrayDeque<Integer> dq) {
        // Your code here
        dq.pollLast();
    }

    // Function to return element from front of the deque.
    public static int front_dq(ArrayDeque<Integer> dq) {
        // Your code here
        int ans = dq.peekFirst();
        return ans;
    }

    // Function to push element x to the front of the deque.
    public static void push_front_pf(ArrayDeque<Integer> dq, int x) {
        // Your code here
        dq.offerFirst(x);
    }
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        push_back_pb(deque, 5);
        pop_back_ppb(deque);
        int front = front_dq(deque);
        System.out.println(front);
        push_front_pf(deque, 10);
    }
}
