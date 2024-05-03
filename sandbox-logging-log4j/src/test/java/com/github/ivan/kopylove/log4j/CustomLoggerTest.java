package com.github.ivan.kopylove.log4j;

import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;

class CustomLoggerTest
{
    private static final Logger LOGGER = Logger.getLogger("myLogger");

    @Test
    void main()
    {
        LOGGER.info("My custom message");
    }
}