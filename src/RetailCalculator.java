import java.util.ArrayList;

public class RetailCalculator {

    public double calculateGrandTotal(ArrayList<Double> prices) {
        double total = 0.0;
        final double sst_rate = 1.06;

        if (prices == null) {
            System.out.println("Error: Price List cannot be null");
            return 0.0;
        }

        for (Double price : prices) {
            if (price == null) {
                System.out.println("Error: Price cannot be null");
                continue;
            }

            if (price < 0.0) {
                System.out.println("Error: Price cannot be negative");
                continue;
            }
            total += price;
        }

        return total * sst_rate;
    }
}
