package JavaStrings;

import java.util.HashMap;
import java.util.Scanner;

public class IsomorphicString {
    public static boolean isIsomorphicString(String str1, String st2){
        HashMap<Character, Character> sToTMap = new HashMap<>();
        HashMap<Character, Character> tToSMap = new HashMap<>();

        for(int i=0; i<str1.length(); i++){
            char s1 = str1.charAt(i);
            char t1 = st2.charAt(i);

            if(!sToTMap.containsKey(s1)){
                sToTMap.put(s1, t1);
            }

            if(!tToSMap.containsKey(t1)){
                tToSMap.put(t1, s1);
            }

            if(sToTMap.get(s1) != t1 || tToSMap.get(t1) != s1){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value of String1 : ");
        String str1 = sc.nextLine();
        System.out.print("Enter the value of String2 : ");
        String str2 = sc.nextLine();
        boolean ans = isIsomorphicString(str1, str2);
        if(ans){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
        
    }
}
