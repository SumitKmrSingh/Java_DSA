package JavaStrings;

import java.util.Scanner;
public class CheckTotalVowelInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any String : ");
        String str = sc.nextLine();
        System.out.println("Given String are : "+str);
        int count=0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == 'A' || str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'I' || str.charAt(i) == 'i' || str.charAt(i) == 'O' || str.charAt(i) == 'O' || str.charAt(i) == 'U' || str.charAt(i) == 'u'){
                      count++;
            }
        }
        System.out.println("Total number of Vowels In a Given String : "+count);
    }
}
