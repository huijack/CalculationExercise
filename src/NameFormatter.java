public class NameFormatter {

    public void formatCustomerName(String name) {
        name = name.trim().toUpperCase();

        if (name.isEmpty()) {
            System.out.println("PLEASE ENTER A NAME");
            return;
        }

        if (name.contains("BIN")) {
            System.out.println("MALE CUSTOMER: " + name);
        } else {
            System.out.println("CUSTOMER: " + name);
        }
    }
}
