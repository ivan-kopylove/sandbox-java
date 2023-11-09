package a2d4be4e8111473998fbc1ccd5ec3dbd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 */
class PrintStackTraceExampleTest
{
    @Test
    void createDeployment()
    {
        String s = Thread.currentThread()
                         .getStackTrace()
                         .toString();
        Assertions.assertTrue(s.startsWith("[Ljava.lang.StackTraceElement;@"));
    }
}
