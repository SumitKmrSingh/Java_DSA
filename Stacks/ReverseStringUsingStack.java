// Reverse String Using Stack

package CollectionFramwork.Stack;

import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.Stack;

public class ReverseStringUsingStack {
    public static String reverseStr(String str){
        // Stack<Character> stack = new Stack<>();

        ArrayDeque<Character> stack = new ArrayDeque<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            stack.push(ch);
        }
        String revStr = "";
        while (!stack.isEmpty() ){                   // We can also write ->  while (stack.isEmpty() != true){}
            revStr = revStr + stack.pop();
        }
        return revStr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any String : ");
        String str = sc.nextLine();
        System.out.println("String Before Reverse : "+str);

        String revStr = reverseStr(str);
        System.out.println("String after Reverse : "+revStr);
    }
}
