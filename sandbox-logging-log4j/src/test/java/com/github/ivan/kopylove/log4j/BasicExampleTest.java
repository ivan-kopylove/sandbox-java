package com.github.ivan.kopylove.log4j;

import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;

class BasicExampleTest
{
    private static final Logger LOGGER = Logger.getLogger(BasicExampleTest.class);

    @Test
    void main()
    {
        LOGGER.info("Hello World");
    }
}