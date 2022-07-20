public class Main {

    public static void main(String[] args) {
//        WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
//        womanGameCalculator.hesapla();
//        womanGameCalculator.gameOver();

        GameCalculator[] gameCalculators = new GameCalculator[]
                {
                        new ManGameCalculator(),
                        new WomanGameCalculator(),
                        new KidsGameCalculator()
                };
        for (GameCalculator gameCalculator: gameCalculators)
        {
            gameCalculator.hesapla();

        }


    }


}
