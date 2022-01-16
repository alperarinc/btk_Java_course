public class Main {

    public static void main(String[] args) {
        double[] myList = {1.2, 7.8, 3.5, 2.6, 0.2};
        double total = 0;
        double max = myList[0];

        for (double number : myList) {

            if (max < number) {
                max = number;
            }
            total = total + number;

            System.out.println(number);
            //System.out.println(total); sayının bir önceki sayı  ile toplamını yazdırıyor.
        }
        System.out.println("En Büyük Sayı : "+ max);
        System.out.println("Toplam Sayı : "+ total);
    }
}
