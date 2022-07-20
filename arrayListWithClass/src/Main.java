import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();
        customers.add(new Customer(1,"Mert","Yılmaz"));
        customers.add(new Customer(2,"Başar","Abak"));
        customers.add(new Customer(3,"Melih","Şirin"));
        customers.add(new Customer(4,"İlker","Kaya"));

        for (Customer customer : customers)
        {
            System.out.println(customer.firstName + " " + customer.lastName);
        }
    }
}
