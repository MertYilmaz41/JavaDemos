import matematik.*;


import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adınız:");

        String ad = scanner.nextLine();

        System.out.println("Merhaba" + " " + ad);


        DortIslem dortIslem = new DortIslem();
        System.out.println(dortIslem.topla(1,6));
        Logaritma logaritma = new Logaritma();
        logaritma.logaritmaHesapla();


    }
}
