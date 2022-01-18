public class Main {

    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();//referance type
        CustomerManager customerManager2 = new CustomerManager();//kullanılmayan referansı Garbage Collector tarafında bellekten silinir. Çöp toplayıcı
        customerManager = customerManager2;
        customerManager.Add();
        customerManager.Delete();
        customerManager.Update();

        //value type
        int sayi = 10;
        int sayi2 = 20;
        sayi2 = sayi;
        sayi=30;
        System.out.println(sayi2);


        int[] sayilar1 = new int[]{1,2,3};
        int[] sayilar2 = new int[]{4,5,6};
        sayilar1 = sayilar2;
        sayilar1[0]=182;
        System.out.println(sayilar2[0]);




    }
}

