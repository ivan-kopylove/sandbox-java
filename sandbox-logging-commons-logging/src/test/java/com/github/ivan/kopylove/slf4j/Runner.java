package com.github.ivan.kopylove.slf4j;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.jupiter.api.Test;

class Runner
{
    private static final Log LOGGER = LogFactory.getLog(Runner.class);

    @Test
    void main()
    {
        LOGGER.trace("trace");
        LOGGER.info("info");
        LOGGER.error("error");
    }
}
