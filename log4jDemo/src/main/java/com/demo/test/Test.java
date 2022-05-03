package com.demo.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test {
    public void logtest(){
        Logger logger = LogManager.getLogger();
        logger.warn("Logtest classı başarıyle loglandı");
    }
}
