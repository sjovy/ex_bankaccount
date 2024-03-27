package se.lexicon;

public class bankaccount {
    // Fields:
    // Since fields are not static they can have different values for different objects
    private long account_number;
    private long account_balance;
    private String customer_name;
    private String customer_email;
    private int customer_phone;

    private int customerID;
    private static int nextCustomerID = 10001;

    // Constructor:
    public bankaccount(String customer_name, String customer_email, int customer_phone,
                       long account_number, long account_balance){
        // This is you call from the outside to create an instance of the class
        // this. refers to the object being created, making each object unique
        // customerID is set directly inside constructor
        this.customerID = nextCustomerID++;
        this.customer_name = customer_name;
        this.customer_email = customer_email;
        this.customer_phone = customer_phone;
        this.account_number = account_number;
        this.account_balance = account_balance;
    }
    // Setters and Getters:

    public int getCustomerID(){
        return customerID;
    }
    public void setAccount_number(long account_number){
        // Setters need no return variable as are reachable throughout the class scope
        this.account_number = account_number;
    }
    public long getAccount_number(){
        return account_number;
    }

    public void setAccount_balance(long account_balance){
        this.account_balance = account_balance;
    }
    public long getAccount_balance(){
        return account_balance;
    }

    public void setCustomer_name(String customer_name){
        this.customer_name = customer_name;
    }
    public String getCustomer_name(){
        return customer_name;
    }

    public void setCustomer_email(String customer_email){
        this.customer_email = customer_email;
    }
    public String getCustomer_email(){
        return customer_email;
    }

    public void setCustomer_phone(int customer_phone){
        // cannot handle area code starting with zero
        this.customer_phone = customer_phone;
    }
    public int getCustomer_phone(){
        return customer_phone;
    }

    // When you use a method: instance.deposit() etc...
    public void deposit(long amount_to_add) {
        // this. no longer needed as this is set to a ready instance
        account_balance = account_balance + amount_to_add;
    }

    public void withdraw(long amount_to_withdraw) {
        if(account_balance > amount_to_withdraw){
            account_balance = account_balance - amount_to_withdraw;
        }
    }


}
