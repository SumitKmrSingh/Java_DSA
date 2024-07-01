/* Replace a character c1 with c2 and c2 with c1 in a string S 
 * 
 * Example 1
 * ----------
 *  Input : grrksfoegrrks,
        c1 = e, c2 = r 
    Output : geeksforgeeks 

    Example 2
    ----------
    Input : ratul,
        c1 = t, c2 = h 
    Output : rahul
 * 
*/

package JavaStrings;

import java.util.Scanner;
public class ReplaceCharacter {
     static String replace(String S, char c1, char c2){
        // Converting String Into character array By Using (toCharArray() method)
        char []ch = S.toCharArray();
        for(int i=0; i<ch.length; i++){
            if(ch[i] == c1){
                ch[i] = c2;
            }
            else if(ch[i] == c2){
                ch[i] = c1;
            }
        }
        String str = new String(ch);
        return str;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any String : ");
        String str = sc.nextLine();
        System.out.print("Enter any two Character : ");
        char c1=sc.next().charAt(0);
        char c2=sc.next().charAt(0);
        String finalStr = replace(str, c1, c2);
        System.out.println(finalStr);
    }
}
