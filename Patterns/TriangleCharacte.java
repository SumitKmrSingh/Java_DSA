/* A
  ABA
 ABCBA
ABCDCBA */

package Patterns;

import java.util.Scanner;

public class TriangleCharacte {
    public static void patterTriangle(int num){
        for(int i=1; i<=num; i++){
            int ch=65; 
            // space
            for(int j=1; j<=num-i; j++){
                System.out.print(" ");
            }
            // Character
            for(int k=1; k<=2*i-1; k++){
                System.out.print((char)ch);
                if(k<i){
                    ch++;
                }
                else {
                    ch--;
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num=sc.nextInt();
        patterTriangle(num);
    }
}
