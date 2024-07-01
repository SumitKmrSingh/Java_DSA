/* Remove Vowel from Strings */

package JavaStrings;

import java.util.Scanner;
public class RemoveVowelFromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any String : ");
        String str = sc.nextLine();
        System.out.println("String Before Removing Vowels : "+str);
        String str1 = "";
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' || ch == 'i' || ch == 'O' || ch == 'O' || ch == 'U' || ch == 'u'){
                continue;
            }
            else {
               // System.out.print(ch);
               str1 = str1 + ch;
            }
        }
        System.out.println("String after Removing Vowels : ");

    }
}
