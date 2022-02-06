import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        BufferedReader reader = null;
        int total = 0;
        try {
           reader =  new BufferedReader(new FileReader("D:\\gitup-dev\\btk_java_course\\javademos\\readingFileDemo\\src\\sayilar.txt"));
           String line = null;
           while ((line = reader.readLine()) != null){
               total += Integer.valueOf(line);
           }
           System.out.println("Toplam = " + total);
        } catch (FileNotFoundException e) {
            System.out.println("hata oluştu 1 " + e);
        } catch (IOException e) {
            System.out.println("hata oluştu 2 " + e);
        } catch (NumberFormatException e){
            System.out.println("hata oluştu 3 " + e);

        }
        finally {
           // System.out.println(reader);
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
}
