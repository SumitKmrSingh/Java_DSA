// Sample Problem: Check for Anagram

/* Problem: Given two strings, check whether two strings are an anagram of 
each other. Two strings are said to be an anagram of each other if they are just
permutations of each other. That is, the set of characters in both the strings 
must be the same, only the order of characters can be different.

Input: string1 = "abcd"
       string2 = "bcad"
Output: Yes

Input: string1 = "listen"
       string2 = "silent"
Output: Yes



Method 1: Sorting. A simple way to solve this problem is to sort both of the 
arrays. Since, both the arrays, contain same set of characters, therefore after 
sorting both of the strings, the strings must become identical.

After sorting, we can use the equals() method to check if both of the strings 
are equal or not and return true or false accordingly.

Time Complexity: O(N*logN)
Auxiliary Space: O(1)

Method 2: Frequency Counting. This involves counting of characters in the string.
We assume that the set of possible characters in both strings is small. In the 
following implementation, it is assumed that the characters are stored using 8 
bit and there can be 256 possible unique characters.

    -> Create an array count[] of size 256 to maintain the frequency of characters for 
        both strings. Initialize all values in count array as 0.
    -> Iterate through every character of both strings and increment the count of 
        characters in the corresponding count array for the first string and decrement 
        the count of characters in the count array for the second string.
    -> If both strings are anagram, then after the above operation, all values in 
        count[] array must be 0.
 */

package JavaStrings;

import java.util.Arrays;

public class AnagramString {
    static final int CHAR=255;

    // Method 1
    public static boolean areAnagram(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }

        // Converting str1 Into char arrray
        char []ch1 = str1.toCharArray();

        // Sort the ch1 char array
        Arrays.sort(ch1);

        // Converting str2 Into char arrray
        char []ch2 = str2.toCharArray();

        // Sort the ch1 char array
        Arrays.sort(ch2);

        // Iterating loop and check each and every character of both ch1 and ch2
        for(int i=0; i<str1.length(); i++){
            if(ch1[i] != ch2[i]){
                return false;
            }
        }
        return true;
    }

    // Method 2
    public static boolean areAnagram2(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        int []count = new int[CHAR];

        for(int i=0; i<str1.length(); i++){
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }

        for(int i=0; i<count.length; i++){
            if(count[i] != 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String stt1 = "aabca";
        String str2 = "acaba";

        boolean res1 = areAnagram(stt1, str2);
        System.out.println(res1);

        boolean res2 = areAnagram2(stt1, str2);
        System.out.println(res2);
    }
}
