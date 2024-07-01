package Stacks;

import java.util.Stack;

public class ReverseStackIterative {
    public static Stack<Integer> reverseStack(Stack<Integer> st){
        // Creating one stack (rt)
        Stack<Integer> rt = new Stack<>();

        // copy all the data of st Stack In rt Stack (st -> rt)
        while(st.size() > 0){
            rt.push(st.pop());
        }

        // Create one another Stack (gt) 
        Stack<Integer> gt = new Stack<>();

        // copy all the data of rt Stack In gt Stack (rt -> gt)
        while (rt.size() > 0) {
            gt.push(rt.pop());
        }

        // again copy all the Data of gt Stack In st Stack (gt -> st)
        while(gt.size() > 0){
            st.push(gt.pop());
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

        System.out.println("Stack Before Reverse : "+st);

        Stack<Integer> temp = reverseStack(st);
        System.out.println("Stack after Reverse : "+temp);
    }
}
