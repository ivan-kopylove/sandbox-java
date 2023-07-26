package com.github.ivan.kopylove.log4j;

import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;

public class ClassnameLoggerTest
{
    private static final Logger LOGGER = Logger.getLogger(ClassnameLoggerTest.class);

    @Test
    public void main()
    {
        LOGGER.info("classname logger");
    }
}