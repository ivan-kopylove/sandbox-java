package com.github.lazyf1sh.slf4j;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class BasicExampleTest {
    @Test
    public void run() {
        Logger logger = LoggerFactory.getLogger(BasicExampleTest.class);
        logger.debug("Debug log message");
        logger.info("Info log message");
        logger.error("Error log message");
    }
}