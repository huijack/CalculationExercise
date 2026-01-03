public class DigitalProduct extends Product {

    private String downloadLink;

    DigitalProduct(String name, double price, String downloadLink) {
        super(name, price);
        this.downloadLink = downloadLink;
    }

    String getDownloadLink() {
        return this.downloadLink;
    }

    void setDownloadLink(String downloadLink) {
        this.downloadLink = downloadLink;
    }
}
