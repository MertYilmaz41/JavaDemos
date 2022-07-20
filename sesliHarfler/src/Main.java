public class Main {

    public static void main(String[] args) {
	    char harf ='A';

       // kalın sesli harfler = a,ı,o,u
       // ince sesli harfler = e,i,ö,ü

        switch (harf)
        {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalın sesli harf");
                break;
            default:
                System.out.println("İnce sesli harf");

        }
    }
}
