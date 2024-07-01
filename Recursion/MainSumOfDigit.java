/* Sum of Digit */

package Recursion;

import java.util.Scanner;
public class MainSumOfDigit {
    public static int sumOfDigit(int num){
        if(num==0){
            return 0;
        }
        int last=num%10;
        return last+sumOfDigit(num/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num=sc.nextInt();
        int result=sumOfDigit(num);
        System.out.println("Sum of "+num+" : "+result);
    }    
}
