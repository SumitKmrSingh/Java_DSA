package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class PushAtBottomRec {
    public static void pushAtBottomRecusive(Stack<Integer> st, int bottom){
        if(st.size() == 0){
            st.push(bottom);
            return;
        }
        int top = st.pop();
        pushAtBottomRecusive(st, bottom);
        st.push(top);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println("Stack Before adding Data In Bottom : "+st);
        System.out.print("Enter the value that you want to add at Bottom In Stack : ");
        int bottom = sc.nextInt();

        pushAtBottomRecusive(st, bottom);
        System.out.println("Stack after adding Data In Bottom : "+st);
    }
}
