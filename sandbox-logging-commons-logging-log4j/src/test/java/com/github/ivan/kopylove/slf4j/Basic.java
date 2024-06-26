package com.github.ivan.kopylove.slf4j;

import one.Runner;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.jupiter.api.Test;

class Basic
{

    private static final Log LOGGER = LogFactory.getLog(Runner.class);

    @Test
    void main()
    {
        LOGGER.debug("Example debug message ..");
        LOGGER.info("Example info message ..");
        LOGGER.warn("Example warn message ..");
        LOGGER.error("Example error message ..");
        LOGGER.fatal("Example fatal message ..");
    }
}
