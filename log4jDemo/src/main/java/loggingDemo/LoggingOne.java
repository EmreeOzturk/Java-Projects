package loggingDemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggingOne {
    private static Logger logger = LogManager.getLogger();
    /*public static void main(String[] args) {
        insertCustomer("Mahmut");
    }*/


    public void insertCustomer(String ad){
        logger.info(ad+" adlı müşteri başarılı bir şekilde eklendi - Customer added successfully");
    }
}
