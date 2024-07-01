package Stacks;

import java.util.Stack;

public class RemoveAtBottom {
    public static Stack<Integer> removeFromBottom(Stack<Integer> st){
        Stack<Integer> temp = new Stack<>();

        while (st.size() > 1) {
            temp.push(st.pop());
        }
        st.pop();

        while (temp.size() > 0) {
            st.push(temp.pop());
        }
        return st;
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println("Stack Before Removing from Bottom : "+st);

        Stack<Integer> temp = removeFromBottom(st);
        System.out.println("Stack after Removing from Bottom : "+temp);
    }
}
