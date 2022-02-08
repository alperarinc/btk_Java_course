public class Main {

    public static void main(String[] args) {
	    Validator validator = new Validator();
        Customer customer = new Customer();
        Product product = new Product();
        validator.validate(product);
        validator.validate(customer);
    }
}
