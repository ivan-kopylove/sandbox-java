package com.github.ivan.kopylove.slf4j;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class CustomLoggerTest
{

    private static final Logger LOGGER = LoggerFactory.getLogger(BasicExampleTest.class);

    @Test
    void run()
    {
        LOGGER.info("My custom message");
    }
}