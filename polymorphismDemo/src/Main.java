public class Main {

    public static void main(String[] args) {
//        BaseLogger[] loggers = new BaseLogger[]
//                {
//                        new FileLogger(),
//                        new DataBaseLogger(),
//                        new EmailLogger(),
//                        new KrediLogger()
//                };
//        for (BaseLogger logger : loggers) {
//            logger.Log("Log mesajı");
//        }
        CustomerManager customerManager = new CustomerManager(new FileLogger());
        customerManager.Add();
    }
}
