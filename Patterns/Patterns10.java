/* * 
* * 
* * * 
* * * * 
* * * * *
* * * *
* * *
* *
* */

package Patterns;

import java.util.Scanner;

public class Patterns10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total no of row : ");
        int row = sc.nextInt();

        // first part
        for(int i=1; i<=row; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // second part
        for(int i=row-1; i>=0; i--){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
