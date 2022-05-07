package com.project.connection1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j2Manager implements ILoggerService {
    Logger logger = LogManager.getLogger();


    @Override
    public void warnLog(String logMessage) {
        logger.warn(logMessage);
    }

    @Override
    public void infoLog(String logMessage) {
        logger.info(logMessage);
    }

    @Override
    public void errorLog(String logMessage) {
        logger.error(logMessage);
    }
}
