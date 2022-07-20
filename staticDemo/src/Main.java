public class Main {

    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Product product = new Product();
        product.id=1;
        product.name="Laptop";
        product.price=1000;
        productManager.add(product);
    }
}
