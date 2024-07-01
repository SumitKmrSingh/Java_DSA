package ExceptionHandling;

import java.util.Scanner;

public class ThrowException {
    public static void divide(int num){ 
        try{
            int res = num/0;
        }
        catch(ArithmeticException e){
            System.out.println("Inside catch Block : ");
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1 : ");
        int num1=sc.nextInt();
        // System.out.print("Etner num2 : ");
        // int num2 = sc.nextInt();
        divide(num1);
    }
}
