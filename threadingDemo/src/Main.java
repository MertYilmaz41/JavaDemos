public class Main {

    public static void main(String[] args) {
        KronometreThread thread1 = new KronometreThread("thread1");

        KronometreThread thread2 = new KronometreThread("thread2");

        KronometreThread thread3 = new KronometreThread("thread3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
