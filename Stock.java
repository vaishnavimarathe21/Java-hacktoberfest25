public class Stock {
    private PurchaseItem item;
    private Customer customer;
    private double quantityNeeded;
    private double quantityAvailable;

    public Stock(PurchaseItem item, Customer customer, double quantityNeeded, double quantityAvailable) {
        this.item = item;
        this.customer = customer;
        this.quantityNeeded = quantityNeeded;
        this.quantityAvailable = quantityAvailable;
    }

    public String generateUniqueItemNo(int index) {
        return "Item" + (index + 1) + "_" + customer.getName();
    }

    public void displayCompleteInformation() {
        System.out.println("Item ID: " + item.getItemId());
        System.out.println("Item Name: " + item.getItemName());
        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Customer Phone: " + customer.getPhoneNumber());
        System.out.println("Quantity Needed: " + quantityNeeded);
        System.out.println("Quantity Available: " + quantityAvailable);
        System.out.println("Total Price: " + item.getUnitPrice() * quantityNeeded);
    }

    public double calculateTotalPrice() {
        return item.getUnitPrice() * quantityNeeded;
    }

    @Override
    public String toString() {
        return "Item ID: " + item.getItemId() + "\nItem Name: " + item.getItemName()
                + "\nCustomer Name: " + customer.getName() + "\nCustomer Phone: " + customer.getPhoneNumber()
                + "\nQuantity Needed: " + quantityNeeded + "\nQuantity Available: " + quantityAvailable
                + "\nTotal Price: " + calculateTotalPrice();
    }
}