public class Main {
    public static void main(String[] args) {


//        BaseLogger[] loggers = new BaseLogger[]{new FileLogger(), new EmailLogger(), new DataBaseLogger(), new ConsoleLogger(), new DenemeLogger()};
//        for (BaseLogger logger : loggers) {
//            logger.log("alper arinç");
//        }
        CustomerManager customerManager = new CustomerManager(new DataBaseLogger());
        customerManager.add();

    }


}

