public class Main {

    public static void main(String[] args) {
        //for
        //i++ : i=i+1
        //i+=2 : i=i+2
        for (int i=1;i<10;i++){
            System.out.println(i);
        }
        System.out.println("For Döngüsü bitti");

        //While
        int i=1;
        while (i<10){
            System.out.println(i);
            i++;
        }
        System.out.println("While Döngüsü bitti");


        //Do While
        int j=100;
        do {
            System.out.println(j);
            j++;
        }  while (j<10);
        System.out.println("Do-While Döngüsü bitti");


    }

}
