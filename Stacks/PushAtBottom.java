package Stacks;

import java.util.Stack;
import java.util.Scanner;

public class PushAtBottom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println("Stack elements Before adding at Bottom : "+st);
        
        System.out.print("Enter the Value that you want to add In bootom of stack : ");
        int x = sc.nextInt();

        Stack<Integer> temp  = new Stack<>();
        while(st.size() > 0){
            temp.push(st.pop());
        }
        st.push(x);

        System.out.println(temp.size());
        while(temp.size() > 0){
            st.push(temp.pop());
        }

        System.out.println("Stack element after adding at Bottom : "+st);

    }
}
