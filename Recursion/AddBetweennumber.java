/* Use recursion to add all of the numbers between 5 to 10. */

package Recursion;

import java.util.Scanner;

public class AddBetweennumber {
    public static int sum(int start, int end){
        if(start < end){
            return end + sum(start, end-1);
        }
        else {
            return end;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any two number : ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int ans=sum(num1,num2);
        System.out.println("Sum of all the number between "+num1+" and "+num2+" : "+ans);
    }
}
