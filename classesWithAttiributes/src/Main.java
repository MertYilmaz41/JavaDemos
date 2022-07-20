public class Main {

    public static void main(String[] args) {
        Product product = new Product(1,"Laptop","Asus Laptop",3000,2,"Siyah");



        System.out.println(product.getName());

        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        productManager.Add2(1, "", "", 2, 200);
        System.out.println(product.getKod());
    }
}
