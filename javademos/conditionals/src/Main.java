public class Main {

    public static void main(String[] args) {
        int sayi = 200;
        int sayi2 = 200;
        int degisken = 20;
        if (sayi < degisken){
            System.out.println("Değişken "+ degisken+"'den küçüktür.");
            if (sayi2 > sayi){
                int toplam = sayi + sayi2;
                System.out.println("Toplam :" + toplam);
            }else{
                int fark = sayi - sayi2;
                System.out.println("Fark :" + fark);
            }
        }else if (sayi == degisken){
            System.out.println("Değişken "+ degisken+"'e eşittir.");
        }else {
            System.out.println("Değişken "+ degisken+"'den büyüktür.");
        }
    }
}
