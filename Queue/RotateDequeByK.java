/* Rotate Deque By K

   Given a Deque deq of size N containing non-negative integers and a positive integer K, the task is to rotate
   elements of the deque by K places in a circular fashion. There will be two rotations which you have to implement
   depending on the type rotating query. Below is the description of rotating type and value of K for which you have to
   rotate in circular way:

    Type-1. right_Rotate_Deq_ByK(): this function should rotate deque by K places in a clockwise fashion.
    Type-2. left_Rotate_Deq_ByK(): this function should rotate deque by K places in an anti-clockwise fashion.


    Example 1:

Input:
6
1 2 3 4 5 6
1 2

Output:
5 6 1 2 3 4

Explanation:
The dequeue is 1 2 3 4 5 6.
The query type is 1 and k is 2. So, we
need to right rotate dequeue by 2 times.
In 1 right rotation we get 6 1 2 3 4 5.
In another we get 5 6 1 2 3 4.


    Example 2:

Input:
6
1 2 3 4 5 6
2 2

Output:
3 4 5 6 1 2

Explanation:
The dequeue is 1 2 3 4 5 6.
The query type is 2 and k is 2. So, we
need to left rotate dequeue by 2 times.
In 1 left rotation we get 2 3 4 5 6 1.
In another we get 3 4 5 6 1 2.
 */

package CollectionFramwork.Queue;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Scanner;

public class RotateDequeByK {

    // Clock - Wise rotation
    public static ArrayDeque<Integer> left_Rotate_Deq_ByK(ArrayDeque<Integer> deq, int n, int k){
//        System.out.println("PeekFirst : "+deq.peekFirst());
//        System.out.println("PeekLast : "+deq.peekLast());
//          System.out.println("PollLast : "+deq.pollLast());

        ArrayDeque<Integer> q = new ArrayDeque<>();
        for(int i=0; i<k; i++){
            q.offerLast(deq.pollLast());
        }

//        System.out.println("PeekLast : "+q.peekLast());
//        System.out.println("PeekFirst : "+q.peekFirst());
//        System.out.println("Peek : "+deq.peekFirst());

        while (!q.isEmpty()){
            deq.offerFirst(q.pollFirst());
        }
//        System.out.println(deq);

        return deq;
    }

    // anti clock wise Rotation
    public static ArrayDeque<Integer> righ_Rotate_Deq_ByK(ArrayDeque<Integer> deq, int n, int k){
        ArrayDeque<Integer> q = new ArrayDeque<>();
        for(int i=0; i<k; i++){
            q.offerLast(deq.pollFirst());
        }
        while (!q.isEmpty()){
            deq.offerLast(q.pollFirst());
        }
//        System.out.println(deq);
        return deq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<Integer> deq = new ArrayDeque<>();
        deq.add(1);
        deq.add(2);
        deq.add(3);
        deq.add(4);
        deq.add(5);
        deq.add(6);
        System.out.println(deq);
        ArrayDeque<Integer> ans =left_Rotate_Deq_ByK(deq, deq.size(), 4);
        System.out.println(ans);

//        int size= deq.size();
//        System.out.print("Enter the Value of Kth rotation : ");
//        int k = sc.nextInt();

//        System.out.print("Enter 1 for left rotation or Enter 2 for right rotation : ");
//        int choice = sc.nextInt();

//        System.out.println("All the elements of Deque are : "+deq);

//        if(choice == 1){
//            ArrayDeque<Integer> leftR = left_Rotate_Deq_ByK(deq, size, k);
//            Iterator it = deq.iterator();
//            System.out.print("Deque after left rotation Deque by K : ");
//            while (it.hasNext()){
//                System.out.print(it.next()+" ");
//            }
////            System.out.println("Deque after left rotation Deque by K : "+leftR);
//        }
//        else if (choice == 2) {
//            ArrayDeque<Integer> rightR =  righ_Rotate_Deq_ByK(deq, size, k);
//            Iterator it = deq.iterator();
//            System.out.print("Deque after right rotation Deque by K : ");
//            while (it.hasNext()){
//                System.out.print(it.next()+" ");
//            }
////            System.out.println("Deque after right rotation Deque by K "+rightR);
//        }
//        else {
//            System.out.println("Invalid Choice");
//        }
    }
}
