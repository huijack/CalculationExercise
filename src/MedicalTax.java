public class MedicalTax extends TaxRule {

    @Override
    double calculateTax(double price) {
        return price * 0.02;
    }
}
