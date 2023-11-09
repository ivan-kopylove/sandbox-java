package com.github.ivan.kopylove.sandbox.testing.mockito;

import com.github.ivan.kopylove.sandbox.testing.mockito.domain.Bottle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.junit.MockitoJUnitRunner;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunnerDelegate;

@PowerMockRunnerDelegate(MockitoJUnitRunner.class)
@PrepareForTest(Bottle.class)
class MockFinalMethodExample
{
    @Test
    void mockfinal()
    {
        Bottle bottle = PowerMockito.mock(Bottle.class);
        PowerMockito.when(bottle.getBottle())
                    .thenReturn("cup");


        Assertions.assertEquals("cup", bottle.getBottle());
    }
}
