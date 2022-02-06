import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //createFile();
        // getFileInfo();
        readFile();
        fileWriter();
        readFile();
    }
    public static void createFile(){
        File file = new File("D:\\gitup-dev\\btk_java_course\\javademos\\files\\students.docx");
        try {
            if (file.createNewFile()){
                System.out.println("Dosya oluşturuldu");
            }else{
                System.out.println("Dosya zaten mevcuttur");
            };
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void getFileInfo(){
        File file = new File("D:\\gitup-dev\\btk_java_course\\javademos\\files\\students.docx");
        if (file.exists()){
            System.out.println("Dosya adı " + file.getName());
            System.out.println("Dosya yolu " + file.getAbsolutePath());
            System.out.println("Dosya yazabilir mi? " + file.canRead());
            System.out.println("Dosya okunabilir mi? " + file.canWrite());
            System.out.println("Dosya boyutu (BYTE) " + file.length());

        }else{
            System.out.println("Dosya bulunamadı");
        }
    }
    public static void readFile(){
        File file = new File("D:\\gitup-dev\\btk_java_course\\javademos\\files\\students.docx");
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()){
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
    public static void fileWriter(){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\gitup-dev\\btk_java_course\\javademos\\files\\students.docx",true));
            writer.newLine();
            writer.write("Java Developer");
            System.out.println("Yazma tamamlandı");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
