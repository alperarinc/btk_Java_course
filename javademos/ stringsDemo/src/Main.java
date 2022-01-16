public class Main {

    public static void main(String[] args) {
        String karakterimiz = " Böğun hava negadten gözel. ";
        System.out.println(karakterimiz);

        /*System.out.println("Karakterinizin olanı :" + karakterimiz.length());
        System.out.println("10 numaralı karakteriniz :" + karakterimiz.charAt(9));
        System.out.println(karakterimiz.concat(" Demi la ") + " ==> diye birleştirdi");
        System.out.println("Karakteriniz 'B' ile mi başlıyor ==> " + karakterimiz.startsWith("B"));
        System.out.println("Karakteriniz '.' ile mi bitiyor ==> " + karakterimiz.endsWith("."));
        char[] aktarılacakKarakter =new char[5];
        karakterimiz.getChars(0,5,aktarılacakKarakter,0);
        System.out.println(aktarılacakKarakter);
        System.out.println("Karakterinizin Enbaşındaki 'e' Harf Dizini :" + karakterimiz.indexOf("e"));
        System.out.println("Karakterinizin Ensondaki 'a' Harf Dizini :" +karakterimiz.lastIndexOf("a"));*/

        String newMesaj = ("Karakterinizin Neresini Değiştirmek istersin :" + karakterimiz.replace(' ', '"'));
        System.out.println(newMesaj);
        System.out.println("Karakterinizden bir kısım alın :"+karakterimiz.substring(7,12));
        for (String kelime:karakterimiz.split(" ") ){
            System.out.println("Karakterinizi parcalara ayırın :" + kelime);
        }
        System.out.println("Karakterinizin başında sonunda boşluk olmasın :" + karakterimiz.trim());




    }


}
