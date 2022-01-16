public class Main {

    public static void main(String[] args) {
	    //220-284 arkadaş sayılar
        int sayi1 = 220;
        int sayi2 = 284;
        int total1 = 0;
        int total2 = 0;


        for (int i=1; i<sayi1;i++) {
            if (sayi1 % i == 0) total1 = total1 + i;
        }
        System.out.println(total1);
        for (int j=1;j<sayi2;j++){
            if (sayi2 % j == 0) total2 = total2 + j;
        }
        System.out.println(total2);

        if (total1 == sayi2 & total2 == sayi1){
            System.out.println("Sayılar arkadaş sayılardır.");
        }else{
            System.out.println("Sayılar arkadaş sayı değildir.");
        }

    }


}

