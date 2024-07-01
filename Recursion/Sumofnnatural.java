package Recursion;

import java.util.Scanner;

public class Sumofnnatural {
    public static int naturalSum(int num){
        if(num > 0){
            return num + naturalSum(num-1);
        }
        else {
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any natural number : ");
        int num=sc.nextInt();
        int result=naturalSum(num);
        System.out.println("Sum of "+num+ "natural number : "+result);
    }
}
