/* Sample Problem: Design a data structure with min/max operations in Java
*
* Problem: Design a data structure that supports following operation in O(1) time complexity.
    insertMin(x): To insert a new minimum element.
    insertMax(x): To insert a new maximum element.
    getMin(): Return the minimum element.
    getMax(): Returns the maximum element.
    extractMin(): Returns and removes the minimum element.
    extractMax(): Returns and removes the maximum element.
*
* Note: We can always insert either a new minimum or a new maximum element in the data structure and nothing else.

Example:
Input: Sequence of operations:
insertMin(5)
insertMax(10)
insertMin(3)
insertMax(15)
insertMin(2)
getMin()
getMax()
insertMin(1)
getMin()
insertMax(20)
getMax()
*
Output:
2
15
1
20
*
*
* Solution: The idea to solve this problem is to use a Deque container to design the required data structure as Deque
* allows us to insert and delete at both ends in constant time complexity.

Along with this, Deque also allows us to access elements at both ends in constant time.

In Java, these ends are called first and last.

Since, we need to insert only a minimum and a maximum element, and we also need to access at any point of time the current
* minimum and maximum respectively. So, we can simply use either of the ends to store the minimum element, and the other end
* to store the maximum element.
* */

package CollectionFramwork.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

class MyDS{
    Deque<Integer> dq;
    MyDS(){
        dq = new ArrayDeque<>();
    }

    // offerFirst() inserts an element at front of Deque
    void insertMin(int x){
        dq.offerFirst(x);
    }

    // offerLast() inserts an element at end of Deque
    void insertMax(int x){
        dq.offerLast(x);
    }

    // peekFirst() returns element at front of Deque
    int getMin(){
        return dq.peekFirst();
    }

    // peekLast() returns an element from the end of Deque
    int getMax(){
        return dq.peekLast();
    }

    // pollFirst() returns and remove the element present at front of Deque
    int extractMin(){
        return dq.pollFirst();
    }

    // pollLast() returns and remove the element present at end of Deque
    int extractMax(){
        return dq.pollLast();
    }
}
public class MaxMinOperations {
    public static void main(String[] args) {
        MyDS myds = new MyDS();
        myds.insertMin(5);
        myds.insertMax(10);
        myds.insertMin(3);
        myds.insertMax(15);
        myds.insertMin(2);

        System.out.println(myds.getMin());   // 2
        System.out.println(myds.getMax());   // 15

        myds.insertMin(1);
        System.out.println(myds.getMin());   // 1

        myds.insertMax(20);
        System.out.println(myds.getMax());   // 20
    }
}
