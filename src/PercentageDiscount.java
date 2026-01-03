public class PercentageDiscount extends Discount {

    private double percent;

    PercentageDiscount(double percent) {
        this.percent = percent;
    }

    @Override
    double apply(double price) {
        return price * (1 - percent);
    }
}
