public class PriceSearch {

    double highestPrice;
    int position;

    public void findHighestPrice(double[] prices) {

        if (prices == null || prices.length == 0) {
            System.out.println("The list is empty.");
            return;
        }

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > highestPrice) {
                highestPrice = prices[i];
                position = i;
            }
        }

        System.out.printf("Highest price is %.1f at index %d.", highestPrice, position);
    }
}
