public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        customer1.setCustomerName("Murat");

        Customer customer2 = new Customer();
        customer2.setCustomerName("YILMAZ");

        Product iphone7 = new Product();
        iphone7.setProductName("iphone15");
        iphone7.setAvailable(false);

        iphone7.registerObserver(customer1);
        iphone7.registerObserver(customer2);

        iphone7.setAvailable(true);

        //ürün bitti
        iphone7.setAvailable(false);

        iphone7.removeObserver(customer1);

        iphone7.setAvailable(true);
    }
}