import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();
        customers.add(new Customer(1,"alper","arinç"));
        customers.add(new Customer(2,"hakan","arinç"));
        customers.add(new Customer(3,"nihal","arinç"));

        customers.remove(1);//arrayList 1. index deki objeyi siler
        customers.remove(3);
        customers.remove(new Customer(1,"alper","arinç"));

        for (Customer customer:customers){
            System.out.println(customer.firstName + " " + customer.lastName);
        }


    }
}
