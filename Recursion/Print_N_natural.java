// print first n natural number

package Recursion;

import java.util.Scanner;

public class Print_N_natural {

    public static void reverseFirstN(int num){
        if(num == 0){
            return;
        }
        System.out.print(num+" ");
        reverseFirstN(num-1);
    }

    // print n natural number 
    public static void firstN(int num){
        if(num == 0){
            return;
        }
        firstN(num-1);
        System.out.print(num+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num = sc.nextInt();
        System.out.print("First "+num+" natural number : ");
        firstN(num);
        System.out.println();
        System.out.print("First "+num+" natural number In reverse order : ");
        reverseFirstN(num);
    }
}
