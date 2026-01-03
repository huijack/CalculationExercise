import javax.naming.Name;
import java.util.ArrayList;

public class Main {
    public static void main (String[] args) {

        /*
        RetailCalculator calculator = new RetailCalculator();
        ArrayList<Double> prices = new ArrayList<>();

        prices.add(100.0);
        prices.add(200.0);
        prices.add(null);
        prices.add(-10.00);

        System.out.println(calculator.calculateGrandTotal(prices));

         */

        /*
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(new Product("Lenovo Thinkpad", 5000));
        cart.addProduct(new DigitalProduct("iPad Pro", 10000, "https://www.apple.com/ipad-pro/"));
        cart.showInventory();

         */

        /*
        PriceSearch prices = new PriceSearch();
        prices.findHighestPrice(new double[] {12.50, 45.00, 10.00});

         */

        /*
        NameFormatter name = new NameFormatter();
        name.formatCustomerName("   ali bin ahmad  ");

         */

        /*
        StockItem item1 = new StockItem("Apple Watch Series 6", 10, 1000.00);
        StockItem item2 = new StockItem("Apple iPhone 12 Pro Max", 10, 1200.00);
        StockItem item3 = new StockItem("Samsung Galaxy S21 Ultra", 10, 1500.00);

        System.out.println(item1.displayDetails());
        System.out.println(item2.displayDetails());
        System.out.println(item3.displayDetails());

        item1.addStock(5);
        System.out.println(item1.displayDetails());

         */

        /*
        double originalPrice = 100.00;
        ArrayList<Discount> discounts = new ArrayList<>();

        discounts.add(new PercentageDiscount(0.10));
        discounts.add(new FlatDiscount(5.00));
        discounts.add(new Discount());

        for (Discount discount : discounts) {
            System.out.println("Final Price: " + discount.apply(originalPrice));
        }

         */

        /*
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new FullTimeEmployee());
        employees.add(new PartTimeEmployee());
        employees.add(new Employee());

        for (Employee employee : employees) {
            System.out.println(employee.getSalary());
        }

         */

        /*
        ArrayList<TaxRule> cartRules = new ArrayList<>();
        cartRules.add(new TaxRule());
        cartRules.add(new MedicalTax());
        cartRules.add(new ExemptTax());

        double itemPrice = 100.00;
        double totalTax = 0.0;

        for (TaxRule rule : cartRules) {
            totalTax += rule.calculateTax(itemPrice);
        }
        System.out.println("Total Tax: RM" + totalTax);

         */

    }
}
