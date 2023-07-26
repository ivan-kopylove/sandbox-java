package com.github.ivan.kopylove.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

public class ClassnameLoggerTest
{
    private static final Logger LOGGER = LogManager.getLogger(ClassnameLoggerTest.class);

    @Test
    public void main()
    {
        LOGGER.info("classname logger");
    }
}