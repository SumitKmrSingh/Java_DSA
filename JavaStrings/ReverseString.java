package JavaStrings;

import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any String : ");
        String str = sc.nextLine();
        System.out.println("Before Reverse : "+str);
        String revStr = "";
        char ch;
        // Method 1
        for(int i=0; i<str.length(); i++){
            ch = str.charAt(i);
            revStr = ch + revStr;
        }
        System.out.println("After Reverse : "+revStr);
    }
}
