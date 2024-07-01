package JavaStrings;

import java.util.Scanner;
public class CountSpaceInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any String : ");
        String str = sc.nextLine();
        System.out.println("Given String are : "+str);
        int countSpace=0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == ' '){
                countSpace++;
            }
        }
        System.out.println("Total Space In a Given String are : "+countSpace);
    }
}
