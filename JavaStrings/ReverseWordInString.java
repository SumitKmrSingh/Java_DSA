package JavaStrings;

import java.util.Scanner;

public class ReverseWordInString {
    public static String revWord(String str){
        String str1="";
        String str2="";
        String res="";
        for(int i=0; i<str.length(); i++){
            str1 = str.charAt(i) + str1;
        }
        for(int i=0; i<str1.length(); i++){
            if(str1.charAt(i) == ' '){
                res = res + str2;
                res = res + " ";
                str2 = "";
            }
            str2 = str1.charAt(i) + str2;
        }
        res = res + str2;
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any String : ");
        String str = sc.nextLine();
        System.out.println("String Before Reverse : "+str);
        String ans = revWord(str);
        System.out.println("String after Reverse : "+ans);

    }
    
}
