public class Main {

    public static void main(String[] args) {
        sayiBulmaca();
    }
    //cemal casing
    public static void sayiBulmaca(){
        int[] sayilar = new int[]{1,2,3,4,5,6,7,8,9};
        int aranacak =5;
        boolean varMi = false;

        for (int sayi: sayilar){
            if (sayi == aranacak){
                varMi=true;
                break;
            }
        }
        if(varMi){
            mesajVer("Sayı mevcuttur");
            //System.out.println("Sayı mevcuttur");
        }else{
            mesajVer("Sayı mevcut değildir");
            //System.out.println("Sayı mevcut değildir.");
        }

    }
    public static void mesajVer(String mesaj){
        System.out.println(mesaj);
    }
}
