package CollectionFramwork.Stack;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class ReverseLinkedListUsingCollectionStack {
    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> list){
        // Crate stack
        // Stack<Integer> stack = new Stack<>();
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int i=0;
        Iterator iterator = list.iterator();

        // Copy all the elements of Linked list In Stack
        while (iterator.hasNext()){
            int top = (Integer) iterator.next();
            stack.push(top);
        }

        // Create a new Linked List
        LinkedList<Integer> revList = new LinkedList<>();

        // Copy all the elements of stack Into Linked list
        while (!stack.isEmpty()){
            revList.add(stack.pop());
        }
//        System.out.println(stack);
//        System.out.println(revList);

        return revList;
    }
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("List Before Reverse : "+list);
        LinkedList<Integer> revList =  reverseLinkedList(list);
        System.out.println("List after Reverse : "+revList);
    }
}
