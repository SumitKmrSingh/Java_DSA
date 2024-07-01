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
Auxiliary Space: O(n).


Method 2: We can use frequency counting. We have assumed that the input strings 
have only lowercase English alphabets.

This involves creating an empty array of size 26(corresponding to the 26 letters
of the English alphabet) and incrementing every corresponding value of the array
by 1 for each letter in str2. Now start traversing through str1 and for every 
letter of str1 decrement the corresponding array values by 1. This will reset 
the value of the array common to str1 and str2, except the extra letter's value.
 */

package JavaStrings;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FindOneExtraCharacter {

    // Method 1
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

    // Method 2
    public static char findExtra2(String str1, String str2){
        int count[] = new int[26];
        
        int n = str1.length();
        
        for(int i=0; i<n; i++)
        {
            count[str2.charAt(i) - 'a']++;
            count[str1.charAt(i) - 'a']--;
        }
        
        count[str2.charAt(n) - 'a']++;
        
        for(int i=0; i<26; i++)
        {
            if(count[i] == 1)
                return (char)(i + 'a');
        }
        
        return 0;
    }
    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "aecd";

        char res = findExtra(str1, str2);
        System.out.println(res);

        char res2 = findExtra2(str1, str2);
        System.out.println(res2);
    }
}
