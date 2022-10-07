public class Main {
    public static void main(String[] args) {

//        BaseLogger[] loggers = new BaseLogger[]{ new BaseLogger(), new DatabaseLogger()};
//        for(BaseLogger logger : loggers){
//            logger.Log("Log message");
//        }
//    }
        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
        customerManager.add();

    }
}
