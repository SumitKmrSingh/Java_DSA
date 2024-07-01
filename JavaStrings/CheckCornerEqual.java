/* Program to check if first and the last characters of string are equal 
 * 
 * Example 1                           Example 2
 * ----------                         ------------
 * Input  : university                 Input  : racecar
   Output : Not Equal                  Output : Equal
 * 
*/

package JavaStrings;

import java.util.Scanner;
public class CheckCornerEqual {

    static int areCornerEqual(String S){

        // Method 1 (Using tocharArray() method)
        // converting String Into charater array by using tocharArray() method
       // char []ch = S.toCharArray();
        // System.out.println(ch[1]);
        
        // for(int i=0; i<ch.length; i++){
        //     int k=i;
        //     while (i<ch.length) {
        //         i++;
        //     }

        //     if(ch[k] == ch[i-1]){
        //         return 1; 
        //     else {
        //         return -1;
        //     }
        // }
        // return 0;

        // Method 2 (Using charAt() method)
        int n = S.length();
        if(n < 2){
            return -1;
        }
        else if(S.charAt(0) == S.charAt(n-1)){
            return 1;
        }
        else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Stirng : ");
        String str = sc.nextLine();
        System.out.println("Given String are : "+str);
        int result =  areCornerEqual(str);
        if(result == 1){
            System.out.println("Equal");
        }
        else {
            System.out.println("not Equal");
        }
    }
}
