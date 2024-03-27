package se.lexicon;


public class App 
{
    public static void main( String[] args ) {
        // Checking that fields work - they did
        /*
        bankaccount customer_1 = new bankaccount();
        customer_1.setAccount_number(123456789);
        customer_1.setAccount_balance(50);
        customer_1.setCustomer_name("Johan Karlsson");
        customer_1.setCustomer_email("johan@gmail.com");
        customer_1.setCustomer_phone(7417418);
        */

        // this works too:
        bankaccount customer_1 = new bankaccount("Anna Svensson", "anna@yahoo.com", 189115, 987654321, 100);
        bankaccount customer_2 = new bankaccount("Johan Karlsson", "johan@gmail.com", 7417418, 123456789, 50);

        System.out.println("Customer: " + customer_1.getCustomer_name() + "\n"
                + "email: " + customer_1.getCustomer_email() + "\n"
                + "phone: " + customer_1.getCustomer_phone() + "\n"
                + "Account number: " + customer_1.getAccount_number() + "\n"
                +  "Balance: " + "$" + customer_1.getAccount_balance());

        System.out.println("Customer: " + customer_2.getCustomer_name() + "\n"
                + "email: " + customer_2.getCustomer_email() + "\n"
                + "phone: " + customer_2.getCustomer_phone() + "\n"
                + "Account number: " + customer_2.getAccount_number() + "\n"
                +  "Balance: " + "$" + customer_2.getAccount_balance());

        System.out.println("\n");
        customer_1.setCustomer_phone(353535);
        System.out.println("phone: " + customer_1.getCustomer_phone());

        customer_1.deposit(60);
        System.out.println("Balance: " + "$" + customer_1.getAccount_balance());

        customer_1.withdraw(10);
        System.out.println("Balance: " + "$" + customer_1.getAccount_balance());

        customer_1.withdraw(200);
        System.out.println("Balance: " + "$" + customer_1.getAccount_balance());

        System.out.println("Balance: " + "$" + customer_1.getCustomerID());
        System.out.println("Balance: " + "$" + customer_2.getCustomerID());



    }
}
