// Reverse List Using Stack

package CollectionFramwork.Stack;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ReverseListUsingStack {
    public static List<Integer> reverseList(List<Integer> list){
        // Stack<Integer> stack = new Stack<>();
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for(int i=0; i<list.size(); i++){
            stack.push(list.get(i));
        }
        for(int i=0; i<list.size(); i++){
            list.set(i,stack.pop());
        }
        return list;
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);

        // List Before Reverse
        System.out.println("List Before Reverse : "+list); // [10, 20, 30, 40, 50, 60, 70, 80, 90]

        // LIst after Reverse
        List<Integer> resList = reverseList(list);
//        System.out.println("List after Reverse : "+reverseList(list));    // We can also write this
        System.out.println("List after Reverse : "+resList); // [90, 80, 70, 60, 50, 40, 30, 20, 10]
    }
}
