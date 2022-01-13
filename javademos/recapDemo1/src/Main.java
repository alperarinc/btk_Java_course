public class Main {

    public static void main(String[] args) {
        int sayi1 =150;
        int sayi2 =11;
        int sayi3 =12;

        if (sayi1>sayi2){
            if (sayi1>sayi3){
                System.out.println("Enbüyük Sayi :" + sayi1);
            }
        }else if(sayi2>sayi3){
            if(sayi1>sayi2){
                System.out.println("Enbüyük Sayi :" + sayi2);
            }
        }else{
            System.out.println("Enbüyük Sayi :" + sayi3);
        }

    }
}
