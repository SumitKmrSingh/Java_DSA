package JavaStrings;

import java.util.Scanner;

public class PangramString {
    public static boolean isPangram(String str){
        str = str.toLowerCase();
        char []arr = new char[26];
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            arr[ch-'a']++;
        }
        for(int i=0; i<26; i++){
            if(arr[i] == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any String : ");
        String str = sc.nextLine();
        System.out.println("Your String are : "+str);
        boolean ans = isPangram(str);
        if(ans){
            System.out.println(str+" Is Pangram");
        }
        else{
            System.out.println(str+" Is not Panagram");
        }
    }
}
