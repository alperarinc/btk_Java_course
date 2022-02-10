public class Main {

    public static void main(String[] args) {
	    KronometreThread thread1 = new KronometreThread("thread1");
        KronometreThread thread2 = new KronometreThread("thread2");
        KronometreThread thread3 = new KronometreThread("thread3");
        KronometreThread thread4 = new KronometreThread("thread4");
        KronometreThread thread5 = new KronometreThread("thread5");




        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();


    }
}
