public class EmailService implements Printable {

    @Override
    public void printReceipt(String data) {
        System.out.println("Sending email: " + data);
    }
}
