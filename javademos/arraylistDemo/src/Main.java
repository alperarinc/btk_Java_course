import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        System.out.println(arrayList);
        arrayList.set(5,"r");
        System.out.println(arrayList);
        System.out.println(arrayList.get(2));
        arrayList.remove(4);
        System.out.println(arrayList);
//        arrayList.clear();
//        System.out.println(arrayList);

        for (Object i:arrayList){
            System.out.println(i);
        }
    }
}
