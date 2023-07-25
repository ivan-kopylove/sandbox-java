package com.github.lazyf1sh.log4j;

import org.apache.log4j.Logger;
import org.junit.Test;

public class BasicExampleTest
{
    private static final Logger LOGGER = Logger.getLogger(BasicExampleTest.class);

    @Test
    public void main()
    {
        LOGGER.info("Hello World");
    }
}