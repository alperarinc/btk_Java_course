public class Main {

    public static void main(String[] args) {
        String ogrenci1 ="Alper";
        String ogrenci2 ="Hakan";
        String ogrenci3 ="Nihal";
        String ogrenci4 ="Aziz";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);



        System.out.println("-------------------------------------------------------");

        String[] ogrenciler = new String[4];
        ogrenciler[0]="Alper";
        ogrenciler[1]="Hakan";
        ogrenciler[2]="Nihal";
        ogrenciler[3]="Aziz";

        for (int i=0;i<ogrenciler.length;i++)
            System.out.println(ogrenciler[i]);

        System.out.println("-------------------------------------------------------");


        for (String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }



    }
}
