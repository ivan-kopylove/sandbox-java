package com.github.ivan.kopylove.sandbox.var;

import com.github.ivan.kopylove.sandbox.domain.case2.CustomClass;
import org.junit.jupiter.api.Test;

/**
 * JEP 286: Local-Variable Type Inference
 */
public class LocalVariableTypeInference
{
    @Test
    public void run()
    {
        var a = 10;
    }

    @Test
    public void run2()
    {
        var puma = new CustomClass();
    }
}
