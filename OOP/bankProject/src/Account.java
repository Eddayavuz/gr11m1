// Create a class.
public class Account {
    // Data members of the class
    private final int accountNumber;
    private final String accountHolder;
    private double accountBalance;

    // Constructor - a special method for initializing objects
    public Account(int number, String name, double balance){
        this.accountNumber = number;
        this.accountHolder = name;
        this.accountBalance = balance;
    }

    // Method to display information about the customer
    public void displayInfo(){
        System.out.println("account number: " + accountNumber);
        System.out.println("account holder: " + accountHolder);
        System.out.println("current balance: " + accountBalance);
    }
    // Method to add money to the account
    public double deposit(int amount){
        this.accountBalance += amount;
        return accountBalance;
    }

}
