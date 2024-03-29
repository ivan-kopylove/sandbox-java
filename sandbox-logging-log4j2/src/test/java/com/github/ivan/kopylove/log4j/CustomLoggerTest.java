package com.github.ivan.kopylove.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

public class CustomLoggerTest
{
    private static final Logger LOGGER = LogManager.getLogger("myLogger");

    @Test
    public void main()
    {
        LOGGER.info("My custom message");
    }
}