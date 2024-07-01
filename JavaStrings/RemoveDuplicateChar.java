/* Java Program To Remove Duplicates From A Given String 
 * 
 *  Input: Str = geeksforgeeks
    Output: geksfor
    Explanation: After removing duplicate characters such as e, k, g, s, we have 
    string as “geksfor”.

    Input: Str = HappyNewYear
    Output: HapyNewYr
    Explanation: After removing duplicate characters such as p, e, a, we have string as “HapyNewYr”.
*/


package JavaStrings;

import java.util.Arrays;
import java.util.Scanner;
import java.util.*;
public class RemoveDuplicateChar {

    public static String removeDuplicate(char []ch, int n){
        int index=0;
        for(int i=0; i<ch.length; i++){
            int j;
            for(j=0; j<i; j++){
                if(ch[i] == ch[j]){
                    break;
                }
            }

            if(j==i){
                ch[index] = ch[i];
                index++;
            }
        }

       char [] copy = Arrays.copyOf(ch, index);
       String removeDuplicateChar = new String(copy);

       // return String.valueOf(Arrays.copyOf(ch, index));

       return removeDuplicateChar;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any String : ");
        String str = sc.nextLine();
        int n=str.length();
        char []ch = str.toCharArray();
        System.out.println("Before Removing Duplicate Character : "+str);
        String removingDuplicate = removeDuplicate(ch,n);
        System.out.println("After Removing Duplicate Character : "+removingDuplicate);

    }
}
