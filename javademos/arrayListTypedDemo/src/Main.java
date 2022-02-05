import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> sehirler = new ArrayList<String>();
        sehirler.add("Ankara");
        sehirler.add("Istanbul");
        sehirler.add("Tokat");
        sehirler.add("Aydın");

        sehirler.remove(0);
      //  sehirler.remove("Aydın");

        Collections.sort(sehirler);
        for (String sehir:sehirler){
            System.out.println(sehir);
        }
    }
}
