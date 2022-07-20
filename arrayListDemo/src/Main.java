import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList sayilar = new ArrayList();

        sayilar.add(1);
        sayilar.add(10);
        sayilar.add("Ankara");
        //System.out.println(sayilar.size());

        //sayilar.set(0,100);

        //sayilar.remove(1);
        //sayilar.clear();
        //System.out.println(sayilar.get(1));

        for (Object sayi : sayilar)
        {
            System.out.println(sayi);
        }
    }
}
