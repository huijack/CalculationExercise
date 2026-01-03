public class StockCheck {

    public static void main(String[] args) {

    }

    public void validateSale(int currentStock, int quantitySold) {
        if (quantitySold > currentStock) {
            throw new RuntimeException("Insufficient stock.");
        }

        if (quantitySold <= 0) {
            throw new RuntimeException("Invalid quantity.");
        }

        return;
    }
}
