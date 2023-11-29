public class Main {
    public static void main(String[] args) {
    // Create a customer object with the information below.
    Account customer1 = new Account(1234, "Eda", 50);

    // Call display info method to show the customer information.
    customer1.displayInfo();

    // Deposit money using the deposit method.
    customer1.deposit(50);
    System.out.println("**************");

    // Call display info method to show the updated customer information.
    customer1.displayInfo();
    }
}