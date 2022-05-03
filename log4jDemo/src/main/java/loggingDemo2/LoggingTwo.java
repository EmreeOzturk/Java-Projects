package loggingDemo2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggingTwo {

    public void log2(){
        Logger logger = LogManager.getLogger();
            logger.warn("LogingTwo classı başarıyle loglandı");
    }
}
