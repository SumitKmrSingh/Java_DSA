/* *********
 *******
  *****
   ***
    * */


package Patterns;

import java.util.Scanner;

public class Pattern8 {
    public static void trianglePatterrn(int num){
        for(int i=num; i>=1; i--){
            // space
            for(int j=i; j<=num-1; j++){
                System.out.print(" ");
            }
            // star
            for(int k=1; k<=2*i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num=sc.nextInt();
        trianglePatterrn(num);
    }
}
