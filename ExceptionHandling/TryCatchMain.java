package ExceptionHandling;

import java.util.Scanner;
class Calulation {
    public int div(int num1, int num2){
        int res=0;
        try{
            if(num1 > num2){
                 res = num1/num2;
            }
            else{
                res = num2/num1;
            }
        }
        catch(ArithmeticException ar){
            System.out.println("Can't Be Divided By 0");
        }
        return res;
    }
}

class TakeInput{
    public int userInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value of num1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the Value of num2 : ");
        int num2 = sc.nextInt();

        // creating the object of Calulation Class
        Calulation cal = new Calulation();
        if(num1 > num2){
             System.out.print(num1+"/"+num2 + "=");
        }
        else {
            System.out.print(num2+"/"+num1 + "=");
        }
       
        return cal.div(num1, num2);
    }
}

public class TryCatchMain {
    public static void main(String[] args) {
        TakeInput input = new TakeInput();
        int res = input.userInput();
        System.out.print(res);
    }
    
}
