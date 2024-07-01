/* Check for Balanced Paranthesis
 *  Auxiliary space: O(N)
 *  Auxiliary space: O(N) */

package CollectionFramwork.Stack;

import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.Stack;

public class AllBalancedBracket {
    public static boolean isBalanced(String str){

        // Creating a new Stack
        // Stack<Character> stack = new Stack<>();
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }
            else {
                if(stack.isEmpty() == true){
                    return false;
                }
                if(stack.peek() == '(' || stack.peek() == '{' || stack.peek() == '['){
                    stack.pop();
                }
            }
        }
        if(stack.size() > 0){
            return false;
        }
        else {
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any String : ");
        String str = sc.nextLine();                   // [({[([{}])]})} -> Check this String this Is not Balanced but It give Balanced
        System.out.println("Your String are : "+str);
        boolean ans = isBalanced(str);
        if(ans){                                      // We can also write -> if(isBalanced(str)){}
            System.out.println(str+" Is Balanced");
        }
        else {
            System.out.println(str+" Is not Balance");
        }
    }
}
