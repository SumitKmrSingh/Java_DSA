// Search Key Elements In Stack

package CollectionFramwork.Stack;

import java.util.Scanner;
import java.util.Stack;

public class SearchInStack {
    public static boolean searchElement(Stack<Integer> st, int key){
        while (!st.isEmpty()){
            int top = st.pop();
            if(top == key){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
        st.push(8);
        st.push(9);
        st.push(10);
        st.push(11);
        st.push(12);
        st.push(13);
        st.push(14);

//        int size = st.size();

        System.out.println("Stack Elements are : "+st);

        System.out.print("Enter any Key to Search In a given Stack : ");
        int key = sc.nextInt();

        boolean ans = searchElement(st, key);
        if(ans){
            System.out.println(key+" Is Present In Stack");
        }
        else {
            System.out.println(key+" Is not Present In Stack");
        }
    }
}
