package com.github.lazyf1sh.slf4j;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClassnameLoggerTest
{
    private static final Logger LOGGER = LoggerFactory.getLogger(BasicExampleTest.class);

    @Test
    public void run()
    {
        LOGGER.info("classname logger");
    }
}