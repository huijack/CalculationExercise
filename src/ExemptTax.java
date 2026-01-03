public class ExemptTax extends TaxRule {

    @Override
    double calculateTax(double price) {
        return 0.0;
    }
}
