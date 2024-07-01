package Patterns;

import java.util.Scanner;

public class Dymond {
    public static void printPattern(int num){
        for(int i=1; i<=num; i++){
            // Space
            for(int j=1; j<=num-i; j++){
                System.out.print(" ");
            }
            // Star
            for(int k=1; k<=i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=num; i>=1; i--){
            // Space
            for(int j=1; j<=num-i; j++){
                System.out.print(" ");
            }
            // Star
            for(int k=1; k<=i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num=sc.nextInt();
        printPattern(num);
    }
}
