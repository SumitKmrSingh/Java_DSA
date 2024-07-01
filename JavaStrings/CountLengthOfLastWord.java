package JavaStrings;

import java.util.Scanner;
public class CountLengthOfLastWord {

    public static int findLengthOfLastWord(String str){
        int len=0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == ' '){
                len=0;
            }
            else {
                len++;
            }
        }
        return len;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any String : ");
        String str = sc.nextLine();
        System.out.println("Given String are : "+str);
        
        // trim() -> removing space from both side of string
        String str2 = str.trim();
        int lengthOfLastWord = findLengthOfLastWord(str2);
        System.out.println("Length of Last Word Of Given String Is : "+lengthOfLastWord);
    }
}
