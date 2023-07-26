package com.github.ivan.kopylove.slf4j;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicExampleTest
{
    private static final Logger LOGGER = LoggerFactory.getLogger(BasicExampleTest.class);

    @Test
    public void run()
    {
        LOGGER.debug("Debug log message");
        LOGGER.info("Info log message");
        LOGGER.error("Error log message");
    }
}