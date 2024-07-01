package Project;

class CustomerDetails extends BankingApp{
    BankDetails []customer;
    public CustomerDetails(BankDetails []customer){
        this.customer=customer;

    }
    
    public void allCustomerDetails() {
        if(customer.length==0){
            System.out.println("Customer Does not Exit");
            return;
        }
        else{
            System.out.println("Total Customer In a Bank Is : "+customer.length);
        }
        for(int i=0; i<customer.length; i++){
            customer[i] = new BankDetails();
            customer[i].showAccount();
        }
    }
}
