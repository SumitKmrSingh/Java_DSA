package Stacks;

import java.util.Stack;

public class DisplayStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        // Method 1 -> (Without Using array)
        Stack<Integer> rt = new Stack<>();
        while(st.size() > 0){
            rt.push(st.pop());
        }

        while(rt.size() > 0){
            int x = rt.pop();
            System.out.print(x+" ");
            st.push(x);
        }
        System.out.println();
        System.out.println(st);
        

        // Method 2 -> (Using array)
        int n = st.size();
        int []arr = new int[n];

        for(int i=n-1; i>=0; i--){
            int x = st.pop();
            arr[i] = x;
        }

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
            st.push(arr[i]);
        }
        System.out.println();

        System.out.println(st);

    }
}
