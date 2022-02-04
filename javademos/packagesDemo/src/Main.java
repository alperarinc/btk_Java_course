import Matematik.DortIslem;
import Matematik.Logoritma;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Merhaba adınız nedir ?");

        String ad =scanner.nextLine();

        System.out.println("Hoşgeldin " + ad);
        System.out.println("Soyadınız nedir? " + ad);
        String soyad = scanner.nextLine();
        System.out.println("LOADİNG....");
        System.out.println("İŞLEMLER KAYDEDİLDİ.PROGRAMA GİRİŞ YAPABİLİRİZ");
        System.out.println("KULLANICI ADI VE SOYADI " + ad +" "+ soyad);


        DortIslem dortIslem = new DortIslem();
        System.out.println(dortIslem.topla(4,5));

        Logoritma logoritma = new Logoritma();
        System.out.println(logoritma.logaritmaHesapla());

    }
}
