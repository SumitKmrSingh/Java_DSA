package JavaStrings;

import java.util.Scanner;
public class PrintFirstLetterOfEveryWord {

        static String firstAlphabet(String str){
        String str1 = str.trim();
        String finalStr = "";
        int len=0;
        for(int i=0; i<str1.length(); i++){
            if(str1.charAt(i) == 0){
                finalStr = finalStr + str1.charAt(i);
            }
            else if(str1.charAt(i) == ' '){
                len=0;
            }
            else {
                len++;
                if(len == 1){
                    finalStr = finalStr + str1.charAt(i);
                }
            }
        } 
          return finalStr;
    }

   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any String : ");
        String str = sc.nextLine();
        System.out.println("Given String are : "+str);
        String res = firstAlphabet(str);
        System.out.println("First Letter of each Word In a given String are : "+res);
   } 
}
