public class Main {

    public static void main(String[] args) {
        BaseKrediManager [] krediManagers = new BaseKrediManager[]{new TarimKradiManager(),new OgretmenKrediManager(), new OgrenciKrediManager()};

        for (BaseKrediManager krediManager:krediManagers){
            System.out.println(krediManager.hesapla(1000));
        }



//        OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
//        System.out.println(ogretmenKrediManager.Hesapla(1000));


    }
}
