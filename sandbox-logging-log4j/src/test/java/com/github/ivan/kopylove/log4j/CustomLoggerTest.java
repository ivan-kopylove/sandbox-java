package com.github.ivan.kopylove.log4j;

import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;

public class CustomLoggerTest
{
    private static final Logger LOGGER = Logger.getLogger("myLogger");

    @Test
    public void main()
    {
        LOGGER.info("My custom message");
    }
}