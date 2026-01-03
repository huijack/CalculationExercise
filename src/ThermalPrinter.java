public class ThermalPrinter implements Printable {

    @Override
    public void printReceipt(String data) {
        System.out.println("Printing on paper: " + data);
    }
}
