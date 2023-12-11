public class brokenShoppingCart { // Main Class

    public static void main(String[] args) {
        System.out.println("Shopping Cart Example");
        ShoppingCart cr = ShoppingCart(); // # mistake 1
        System.out.println(cr.applyDiscount(100,10));
    }
}

class ShoppingCart{
    public double totalPrice; // mistake #2

    public ShoppingCard(double totalPrice) { // mistake #3
        this.totalPrice = 0.0; // mistake #4
    }

    double applyDiscount(double originalPrice, double discountPercentage); // mistake #5
    {
        return totalPrice = originalPrice - (originalPrice * (discountPercentage/100));
    }
    double calculateTax(double price) {
        return price * 0.10;
    }

    public double calculateTotalPrice(int quantity, double pricePerUnit) {
        return quantity * pricePerUnit;
    }
    public addProduct(double price) { // mistake #6
        this.totalPrice += price;
    }
}
