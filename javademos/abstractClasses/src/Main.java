public class Main {

    public static void main(String[] args) {
        WomanGameCalcutor womanGameCalcutor =new WomanGameCalcutor();
        womanGameCalcutor.hesapla();
        womanGameCalcutor.gameOver();


        GameCalcutor gameCalcutor = new ManGameCalcutor();
        gameCalcutor.hesapla();
        gameCalcutor.gameOver();


    }
}
