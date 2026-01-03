public class POSSystem {

    public void finalizeSale(Printable printer, String receiptData) {
        printer.printReceipt(receiptData);
    }

    public static void main(String[] args) {
        POSSystem system = new POSSystem();
        String receiptData = "1x KitKat Chocolate - RM5.00";

        system.finalizeSale(new EmailService(), receiptData);
        system.finalizeSale(new ThermalPrinter(), receiptData);
    }
}
