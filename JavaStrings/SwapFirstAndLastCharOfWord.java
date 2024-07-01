/* Java program to swap first and last characters of words in a sentence */

package JavaStrings;

import java.util.Scanner;
public class SwapFirstAndLastCharOfWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Strings : ");
        String str = sc.nextLine();
        System.out.println("String Before Swapping first and Last Character of the word  : "+str);
        
        char []ch = str.toCharArray();    // Converting String Into character array
        for(int i=0; i<ch.length; i++){
            int k=i;
            while(i<ch.length && ch[i] != ' '){
                i++;
            }

            char temp = ch[k];
            ch[k] = ch[i-1];
            ch[i-1] = temp;
        }
        String str1 = new String(ch);   // Converting charaacter array Into String
        System.out.println("String after Swaping first and Last Character of the word: "+str1);

    }
}
