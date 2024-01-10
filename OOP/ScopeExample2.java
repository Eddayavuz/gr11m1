/*
1. Complete the code in the addProduct method to update the total cost by adding the specified product and print the new total. Comment on whether localTotalCost can be accessed in the removeProduct method.
2. Complete the code in the removeProduct method to update the total cost by removing the specified product and print the new total. Comment on whether the totalCost can be accessed in the addProduct method and whether localRemoveTotal can be accessed in the addProduct method.
3. In the main method, create an instance of ProductOrder, add and remove products, and observe the changes to the total cost. Comment on whether the addProduct or removeProduct methods can directly access localTotalCost or localRemoveTotal.
*/

public class ScopeExample2 {
    public static void main(String[] args) {
        // TODO: Create an instance of ProductOrder, add and remove products,
        // and observe the changes to the total cost.

        // Can addProduct or removeProduct methods directly access localTotalCost or localRemoveTotal?
    }
}
class ProductOrder {

    private double totalCost = 0.0;

    public void addProduct(String productName, double price, int quantity) {
        double localTotalCost = totalCost;
        double productTotal = price * quantity;

        // TODO: Write code here to update the total cost and print the new total.

        // Can localTotalCost be accessed in removeProduct method?
    }
    public void removeProduct(String productName, double price, int quantity) {
        // TODO: Write code here to update the total cost by removing the specified product and print the new total.



        // Can totalCost be accessed in addProduct method?

        // Can localRemoveTotal be accessed in addProduct method?
    }
}