package se.lexicon;

public class bankaccount {
    // Fields:
    private long account_number;
    private long account_balance;
    private String customer_name;
    private String customer_email;
    private int customer_phone;

    // Setters and Getters:
    public void setAccount_number(long account_number){
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

    // Constructor:
    public bankaccount(String customer_name, String customer_email, int customer_phone,
                       long account_number, long account_balance){
        this.customer_name = customer_name;
        this.customer_email = customer_email;
        this.customer_phone = customer_phone;
        this.account_number = account_number;
        this.account_balance = account_balance;
    }

    public static long changeBalance(long amount_to_add, long account_number){
        //todo: implement logic:
        // loop to find correct account (but loop through what?)
        // OR: use instance getAccount_balance, do math, setAccount_balance ???
        // check balance, add/deduct amount to balance (avoid negative balance)
        return 0;

    // Extra: Have a static counter that increment and assign the account number.

    }
}
