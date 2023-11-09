package a2d4be4e8111473998fbc1ccd5ec3dbd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class PrintStackTraceExampleTest
{
    @Test
    void createDeployment()
    {
        String s = Thread.currentThread()
                         .getStackTrace()
                         .toString();
        assertTrue(s.startsWith("[Ljava.lang.StackTraceElement;@"));
    }
}
