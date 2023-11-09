package com.github.ivan.kopylove.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

class ForgotExceptionExample
{
    private static final Logger LOGGER = LogManager.getLogger("myLogger");

    @Test
    void incorrect()
    {
        try
        {
            new SomeService().veryComplexLogic();
        }
        catch (Exception e)
        {
            LOGGER.error("Now I spend ages to find NPE root cause");
        }
    }

    @Test
    void correct()
    {

        try
        {
            new SomeService().veryComplexLogic();
        }
        catch (Exception e)
        {
            LOGGER.error("I can quickly find root cause", e);
        }
    }
}
