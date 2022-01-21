public class ProductManager {
    public void Add(Product product){
        //JDBC //Bu alan database yazdırma alanı //*ekle *sil *güncelle *arama
        System.out.println("Ürün Eklendi :) " + product.getName());
    }


    public void Delete(Product product){


        System.out.println("Ürün Silindi :)  " + product.getName());
    }
}
