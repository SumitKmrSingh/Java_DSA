package Project;

import java.util.Scanner;
public class BankDetails {
    private String accno;  
    private String name;  
    private String acc_type;  
    private long balance;

    Scanner sc = new Scanner(System.in);  

    //method to open new account  
    public void openAccount() {  
        System.out.print("Enter Account No: "); 
        accno = sc.next();
        System.out.print("Enter Account type: ");  
        acc_type = sc.next();  
        System.out.print("Enter Name: ");  
        name = sc.next(); 
        
        try{
            System.out.print("Enter Balance: ");  
            balance = sc.nextLong();
        }
        catch(ArithmeticException a){
            System.out.println("Please enter Blance In numberic Value");
        }
      
    }  

    //method to display account details  
    public void showAccount() { 
        System.out.println("*************************************"); 
        System.out.println("Name of account holder: " + name);  
        System.out.println("Account no.: " + accno);  
        System.out.println("Account type: " + acc_type);  
        System.out.println("Balance: " + balance);  
        System.out.println("*************************************");
    }  

    //method to deposit money  
    public void deposit() {  
        long amt;  
        System.out.print("Enter the amount you want to deposit: ");  
        amt = sc.nextLong();  
        balance = balance + amt; 
        System.out.println("*************************************");
        System.out.println("Blance after Deposite : "+balance);
        System.out.println("*************************************");
    }  

    //method to withdraw money  
    public void withdrawal() {  
        long amt;  
        System.out.println("Enter the amount you want to withdraw: ");  
        amt = sc.nextLong(); 
        System.out.println("*************************************"); 
        if (balance >= amt) {  
            balance = balance - amt;  
            System.out.println("Balance after withdrawal: " + balance);  
        } else {  
            System.out.println("Your balance is less than " + amt + "\tTransaction not proced ahead...!!" );  
        }  
        System.out.println("*************************************");
    }  

    //method to search an account number  
    public boolean search(String ac_no) {  
        if (accno.equals(ac_no)) {  
            showAccount();  
            return (true);  
        }  
        return (false);  
    }
}
