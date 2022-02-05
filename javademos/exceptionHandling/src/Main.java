public class Main {

    public static void main(String[] args) {
        try {
            int[] sayilar = new int[]{1, 2, 3};
            System.out.println("İşlem başarılı " + sayilar[7]);

        } catch (Exception exception) {
            System.out.println("işlem başarısız");
            System.out.println("hata oluştu");
        } finally {
            System.out.println("işlem sonuçlandı");
        }

    }
}
