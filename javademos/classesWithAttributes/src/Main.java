public class Main {

    public static void main(String[] args) {
	    Product product = new Product();
        product.setId(1);
        product.setName("Laptop");
        product.setDescription("Lenovo Laptop");
        product.setPrice(5000);
        product.setStockAmount(3);
        product.setRenk("kırmızı");


        ProductManager productManager=new ProductManager();
        productManager.Add(product);

        ProductManager productManager1=new ProductManager();
        productManager1.Delete(product);

        System.out.println(product.getKod());
    }
}
