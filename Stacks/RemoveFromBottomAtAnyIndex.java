package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class RemoveFromBottomAtAnyIndex {
    public static Stack<Integer> removeFromBottomAnyIndex(Stack<Integer> st, int idx){
        if(idx < 0 || idx > st.size()){
            System.out.println("Wrong Index");
        }

        Stack<Integer> temp = new Stack<>();
        while (st.size() > idx) {
            temp.push(st.pop());
        }
        st.pop();

        while (temp.size() > 0) {
            st.push(temp.pop());
        }

        return st;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println("Stack Before Removing from Bottom : "+st);
        System.out.print("Enter the Index Value that you want to remove : ");
        int idx = sc.nextInt();

        Stack<Integer> temp = removeFromBottomAnyIndex(st, idx);
        System.out.println("Stack after Removing from Bottom : "+temp);
    }
}
