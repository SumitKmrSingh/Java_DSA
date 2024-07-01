/* Find the ASCII value of a character
Problem Statement: Given a character, Find the ASCII value of the character.

Example 1:
Input: c = ‘A’
Output: 65
Explanation: ASCII value of A is 65

Example 2:
Input: c = ‘e’
Output: 101
Explanation: ASCII value of e is 101

*/

package StringPractice;

import java.util.Scanner;

public class ASCIIValueChar {
    public static int value(char ch){
        // int ascii = (int)ch;   // It Is also Correct
        int ascii = (int)ch;
        return ch;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Character : ");
        char ch = sc.next().charAt(0);
        int result = value(ch);
        System.out.println("ASCII Value of "+ch+" : "+result);
    }
}
