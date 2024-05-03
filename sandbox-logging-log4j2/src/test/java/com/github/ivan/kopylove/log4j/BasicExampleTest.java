package com.github.ivan.kopylove.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

class BasicExampleTest
{

    private static final Logger LOGGER = LogManager.getLogger(BasicExampleTest.class);

    @Test
    void main()
    {
        LOGGER.trace("Hello World");
    }
}