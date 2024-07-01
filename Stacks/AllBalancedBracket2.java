/* Check for Balanced Paranthesis
*  Auxiliary space: O(N)
*  Auxiliary space: O(N)
* */

package CollectionFramwork.Stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;

public class AllBalancedBracket2 {
    public static boolean isMatching(char a, char b){
        if(a == '(' && b == ')'){
            return true;
        }
        if(a == '{' && b == '}'){
            return true;
        }
        if(a == '[' && b == ']'){
            return true;
        }
        return false;
    }
    public static boolean isBalanced(String str){
        // Creating Stack
        // Stack<Character> st = new Stack<>();
        Deque<Character> st = new ArrayDeque<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                st.push(ch);
            }
            else {
                if(st.isEmpty() == true){
                    return false;
                } else if (isMatching(st.peek(), ch) == false) {
                    return false;
                }
                else {
                    st.pop();
                }
            }
        }
        if(st.size() > 0){
            return false;
        }
        else {
            return true;
        }

//        return st.isEmpty()==true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Sting : ");
        String str = sc.nextLine();
        System.out.println("Your String are : "+str);
        boolean ans = isBalanced(str);
        if(ans){
            System.out.println(str+" Is Balanced");
        }
        else {
            System.out.println(str+" Is not Balance");
        }
    }
}
