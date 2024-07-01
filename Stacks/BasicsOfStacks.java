package Stacks;

import java.util.Stack;

public class BasicsOfStacks {
    public static void main(String[] args) {
        Stack st = new Stack<>();
        st.push(1);
        st.push(23);
        st.push(90);
        st.push(5);
        st.push(34);

        System.out.println(st);
        // System.out.println(st.peek());
        // st.pop();
        // System.out.println(st);
        // st.pop();
        // System.out.println(st);
        // st.pop();
        System.out.println(st);
        System.out.println(st.size());

        // print first element of stack
        while(st.size() > 1){
            st.pop();
        }
        System.out.println(st.peek());
        System.out.println(st);
    }
}
