public class Main {

    public static void main(String[] args) {//overloding //aşırı yükleme
	    Product product = new Product(1,"Laptop","lenovo laptop",5000,3,"mavi");

//        product.setId(1);
//        product.setName("Laptop");
//        product.setDescription("Lenovo Laptop");
//        product.setPrice(5000);
//        product.setStockAmount(3);
//        product.setRenk("kırmızı");


        ProductManager productManager=new ProductManager();
        productManager.Add(product);

        ProductManager productManager1=new ProductManager();
        productManager1.Delete(product);

        System.out.println(product.getKod());
    }
}
