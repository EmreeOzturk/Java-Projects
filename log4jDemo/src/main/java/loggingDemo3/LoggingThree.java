package loggingDemo3;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggingThree {
    public void log3(){
        Logger logger = LogManager.getLogger();
        logger.fatal("LogingThree classı başarıyle loglandı");
    }
}
