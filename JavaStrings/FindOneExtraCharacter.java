// Sample Problem: Find one extra character

/* Problem: Two strings are given of lengths n and n+1. The second string contains all the characters of the first string, but there is one extra character. The task is to find the extra character in the second string.

Note: The characters in strings can be in any order.

Examples :
Input: str1 = "abcd";
       str2 = "cbdae";
Output: e
Explanation: str2 contains all the element 
of str1 with one extra alphabet 'e'.

Input: str1 = "kxml";
       str2 = "klxml";
Output: l
Explanation: str2 contains all the element 
of str1 with one extra alphabet 'l'.



Method 1: A simple method is to sort both of the arrays, and then start comparing
 characters one by one from start. If we found a mismatch, then the mismatched 
 character from the second string is the answer as it has one extra character. 
 If we don't find a mismatch, then the last character in the second string is 
 the answer.

Note: Java doesn't provide a sort function for the String class. We need to 
convert the String to a character array and then use Arrays.sort().

Time Complexity: O(N*logN), where N is the length of the string.
Auxiliary Space: O(1).
 */

package JavaStrings;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FindOneExtraCharacter {
    public static char findExtra(String str1, String str2){
        char []ch1 = str1.toCharArray();
        Arrays.sort(ch1);
        char []ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        for(int i=0; i<str1.length(); i++){
            if(ch1[i] != ch2[i]){
                return ch2[i];
            }
        }
        return ch2[str1.length()];
    }
    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "aecd";

        char res = findExtra(str1, str2);
        System.out.println(res);
    }
}
