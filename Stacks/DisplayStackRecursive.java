package Stacks;

import java.util.Stack;

public class DisplayStackRecursive {
    public static void displayRec(Stack<Integer> st){
        if(st.size() == 0){
            return;
        }
        int top = st.pop();
        displayRec(st);
        System.out.print(top+" ");
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.print("Stack elements are : ");
        displayRec(st);
        System.out.println();
        System.out.println(st);
    }
}
