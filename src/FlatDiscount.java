public class FlatDiscount extends Discount {

    private double amount;

    public FlatDiscount(double amount) {
        this.amount = amount;
    }

    @Override
    double apply(double price) {
        return price - amount;
    }
}
