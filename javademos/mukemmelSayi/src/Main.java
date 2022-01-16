public class Main {

    private static boolean isPrime;

    public static void main(String[] args) {
        //6-->1,2,3
        //28-->1,2,4,7,14
        int number = 265487968;
        int total = 0;
        boolean isPrime = true;

        if (number==1){
            System.out.println("Sayı asal değilidir");
            return;
        }

        if (number<1){
            System.out.println("Geçersiz sayı girdiniz");
            return;
        }

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total = total + i;
            }
        }
        if (total == number){
            System.out.println(total);
            System.out.println("Mükemmel sayıdır");
        }else {
            System.out.println(total);
            System.out.println("Mükemmel sayı değil");
        }


    }
}