public class Main {

    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel";
        String yeniMesaj = sehirVer();
        System.out.println(yeniMesaj);
        int sayi =topla(864654,7654654);
        System.out.println(sayi);
        int toplam = topla2(1,3,3,6,5,4,8,8,7);//variable arguments
        System.out.println(toplam);
        add();
        delete();
        update();


    }
    public static void add(){
        System.out.println("Eklendi");
    }
    public static void delete() {
        System.out.println("Silindi");
    }
    public static void update() {
        System.out.println("Güncellendi");
    }
    public static int topla(int sayi1, int sayi2) {
        return sayi1+sayi2;
    }
    public static int topla2(int... sayilar){//variable arguments
        int toplam = 0;
        for (int sayi:sayilar){
            toplam+=sayi;
        }
        return  toplam;
    }

    public static String sehirVer(){
        return "ANKARA";
    }
}
