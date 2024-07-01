/* Write a program to sort characters in a string
Problem Statement:  Write a program to sort characters (numbers and punctuation 
symbols are not included) in a given string. 

Example 1:
Input: String str = “zxcbg”
Output: bcgxz
Explanation: After sorting we get string as bcgxz

Example 2:
Input: String str = “edcba”
Output: abcde
Explanation: After sorting we get string as abcde

*/

package StringPractice;

import java.util.Arrays;
import java.util.Scanner;

public class SortChararray {
    public static String sortChar(String str, int strLen){
        // Converting String to charArray
        char []ch = str.toCharArray();

        // Method 1
        // applying Buoble Sort
        // for(int i=0; i<strLen-1; i++){
        //     for(int j=0; j<strLen-i-1; j++){
        //         if(ch[j] > ch[j+1]){
        //             char temp = ch[j];
        //             ch[j] = ch[j+1];
        //             ch[j+1] = temp;
        //         }
        //     }
        // }

        // Method 2
        Arrays.sort(ch);

        // Converting charArray to String
        String ans = new String(ch);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any String Value : ");
        String str = sc.nextLine();
        System.out.println("String Before Sorting : "+str);
        int strLen = str.length();
        String result = sortChar(str, strLen);
        System.out.println("String after Sorting : "+result);
    }
}
