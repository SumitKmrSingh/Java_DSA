package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class MoveStackInSameOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        System.out.print("Enter the number of elements you want to Insert : ");
        int n = sc.nextInt();
        System.out.print("Enter the elements : ");
        for(int i=1; i<=n; i++){
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.print("All the elements of Stack are : "+st);
        System.out.println();

        // reverse order
        Stack<Integer> gt = new Stack<>();
        while(st.size() > 0){
            // int t = st.peek();
            // gt.push(t);
            // st.pop();

            gt.push(st.pop());
        }
        System.out.print("All the elements of Stack from st -> gt : "+gt);
        System.out.println();

        Stack<Integer> rt = new Stack<>();
        while(gt.size() > 0){
            rt.push(gt.pop());
        }
        System.out.print("All the elements Copy from gt -> rt or st -> rt : "+rt);
    }
}
