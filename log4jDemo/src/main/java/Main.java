import com.demo.test.Test;
import loggingDemo.LoggingOne;
import loggingDemo2.LoggingTwo;
import loggingDemo3.LoggingThree;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    public static void main(String[] args) {
        Logger logger = LogManager.getLogger();
        //log levels
       /* logger.trace("Trace Log");
        logger.debug("Debug Log");
        logger.info("Info Log");
        logger.warn("Warn Log");
        logger.error("Error Log");
        logger.fatal("Fatal Log");*/

        LoggingOne log1 = new LoggingOne();
        LoggingTwo log2 = new LoggingTwo();
        LoggingThree log3 = new LoggingThree();
        Test test = new Test();


        log1.insertCustomer("Mahmut");
        log2.log2();
        log3.log3();
        test.logtest();
    }
}
