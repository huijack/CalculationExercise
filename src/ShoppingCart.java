import java.util.ArrayList;

public class ShoppingCart {

    public ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void showInventory() {
        for (Product product : products) {
            System.out.printf("Product Name: %s\n", product.getName());
            if (product instanceof DigitalProduct) {
                DigitalProduct digitalProduct = (DigitalProduct) product;
                System.out.printf("Download Link: %s\n", digitalProduct.getDownloadLink());
            }
            System.out.println();
        }
    }
}
