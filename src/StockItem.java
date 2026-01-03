public class StockItem {

    private String itemName;
    private int quantity;
    private double price;

    StockItem(String itemName, int quantity, double price) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
    }

    public void addStock(int amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount.");
            return;
        }
        this.quantity += amount;
    }

    String displayDetails() {
        return String.format("Item: %s | Qty: %d | Total Value: RM%.2f", itemName, quantity, quantity * price);
    }
}
