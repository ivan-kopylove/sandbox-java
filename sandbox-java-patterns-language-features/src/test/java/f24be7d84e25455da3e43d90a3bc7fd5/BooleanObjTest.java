package f24be7d84e25455da3e43d90a3bc7fd5;

import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicBoolean;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BooleanObjTest
{
    @Test
    void run()
    {
        Boolean a = false;
        Boolean b = Boolean.FALSE;

        modifyBoolean(a);
        modifyBoolean(b);

        assertFalse(a);
        assertFalse(b);
    }

    private void modifyBoolean(Boolean value)
    {
        value = true;
        // value.set(true) - no such a built-in method in JCL
    }

    @Test
    void atomicBoolean()
    {
        AtomicBoolean a = new AtomicBoolean(false);
        modifyAtomicBoolean(a);
        assertTrue(a.get());
    }

    private void modifyAtomicBoolean(AtomicBoolean value)
    {
        value.set(true);
    }
}
