package com.github.ivan.kopylove.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

class CustomLoggerTest
{
    private static final Logger LOGGER = LogManager.getLogger("myLogger");

    @Test
    void main()
    {
        LOGGER.info("My custom message");
    }
}