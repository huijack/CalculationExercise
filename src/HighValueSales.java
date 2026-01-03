import java.util.ArrayList;

public class HighValueSales {

    public static void main(String[] args) {
        HighValueSales sales = new HighValueSales();
        ArrayList<Double> salesList = new ArrayList<>();
        salesList.add(100.0);
        salesList.add(600.0);
        salesList.add(200.0);
        salesList.add(500.0);
        salesList.add(780.0);

        sales.filterHighValueSales(salesList);
    }

    public void filterHighValueSales(ArrayList<Double> sales) {
        ArrayList<Double> highValue = new ArrayList<>();

        for (Double sale : sales) {
            if (sale > 500) {
                highValue.add(sale);
            }
        }

        System.out.println(highValue);
    }
}
