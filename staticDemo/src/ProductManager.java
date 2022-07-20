public class ProductManager {
    public void add(Product product)
    {
        if (ProductValidator.isValid(product))
        {
            System.out.println(product.name + " " +  "eklendi.");
        }
        else
        {
            System.out.println("Ürün bilgileri geçersizdir.");
        }

    }


}
