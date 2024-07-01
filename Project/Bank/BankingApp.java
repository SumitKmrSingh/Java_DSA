package Project;

import java.util.Scanner;
public class BankingApp{
    public static void main(String[] args)  {  
        Scanner sc = new Scanner(System.in);

        //create Initial account
        System.out.print("How many number of customers do you want to input ? ");
        int num = sc.nextInt();
        BankDetails []c = new BankDetails[num];
        for(int i=0; i<c.length; i++){
            System.out.println("####################################");
            System.out.println("Enter all the Details of Customer_"+(i+1));
            c[i] = new BankDetails();
            c[i].openAccount();
            System.out.println("####################################");
        }

        //loop runs until number 5 is not pressed to exit  
        int ch;
        do {
                System.out.println("####################################");
                System.out.println("***Banking System Applications***");
                System.out.println("1. Display all account details");
                System.out.println("2. Search by Account number");
                System.out.println("3. Deposit the amount");
                System.out.println("4. Withdraw the amount");
                System.out.println("5. Show All the Details of all Customer");
                System.out.println("6. Exit ");
                System.out.println("####################################");

                System.out.print("Enter your Choice : ");
                ch=sc.nextInt();
                System.out.println("####################################");

                switch (ch) {  
                    case 1:  
                        for (int i = 0; i < c.length; i++) {  
                            c[i].showAccount();  
                        }  
                        break; 

                    case 2:  
                        System.out.print("Enter account no. you want to search: ");  
                        String ac_no = sc.next();  
                        boolean found = false;  
                        for (int i = 0; i < c.length; i++) {  
                            found = c[i].search(ac_no);  
                            if (found) {  
                                break;  
                            }  
                        }  
                        if (!found) {  
                            System.out.println("Search failed! Account doesn't exist..!!");  
                        }  
                        break; 

                    case 3:  
                        System.out.print("Enter Account no. : ");  
                        ac_no = sc.next();  
                        found = false;  
                        for (int i = 0; i < c.length; i++) {  
                            found = c[i].search(ac_no);  
                            if (found) {  
                                c[i].deposit();  
                                break;  
                            }  
                        }  
                        if (!found) {  
                            System.out.println("Search failed! Account doesn't exist..!!");  
                        }  
                        break; 

                    case 4:  
                        System.out.print("Enter Account No : ");  
                        ac_no = sc.next();  
                        found = false;  
                        for (int i = 0; i < c.length; i++) {  
                            found = c[i].search(ac_no);  
                            if (found) {  
                                c[i].withdrawal();  
                                break;  
                            }  
                        }  
                        if (!found) {  
                            System.out.println("Search failed! Account doesn't exist..!!");  
                        }  
                        break; 
                        
                    case 5:
                        // CustomerDetails r = new CustomerDetails(c);
                        // r.allCustomerDetails();

                        for(int i=0; i<c.length; i++){
                            System.out.println("All The Details of Customer_"+(i+1));
                            c[i].showAccount();
                        }
                        break;


                    case 6:  
                        System.out.println("See you soon...");  
                        break;  
                }  
             

        }while(ch != 5);
    }
}
