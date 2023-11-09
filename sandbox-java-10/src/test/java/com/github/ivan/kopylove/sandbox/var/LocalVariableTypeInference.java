package com.github.ivan.kopylove.sandbox.var;

import com.github.ivan.kopylove.sandbox.domain.case2.CustomClass;
import org.junit.jupiter.api.Test;

/**
 * JEP 286: Local-Variable Type Inference
 */
class LocalVariableTypeInference
{
    @Test
    void run()
    {
        var a = 10;
    }

    @Test
    void run2()
    {
        var puma = new CustomClass();
    }
}
