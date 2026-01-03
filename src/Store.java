public class Store {

    static int totalStoresCount;
    String storeName;

    Store(String storeName) {
        this.storeName = storeName;
        totalStoresCount++;
    }

    public static void main (String[] args) {
        Store store1 = new Store("Store 1");
        Store store2 = new Store("Store 2");
        Store store3 = new Store("Store 3");

        System.out.println(totalStoresCount);
    }
}
