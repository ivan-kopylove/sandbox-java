package com.github.ivan.kopylove.e440e7e7bdd943e2a745cbdd2b35242b;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Aspect
@Component
class AspectConfig
{
    static List<String> CALLED_TYPES = new ArrayList<>();

    @Before(value = "myPointCut()")
    void logBefore(JoinPoint joinPoint)
    {
        CALLED_TYPES.add(joinPoint.getSignature()
                                  .getDeclaringType()
                                  .getSimpleName());
    }

    @Pointcut("@target(org.springframework.stereotype.Service)")
    void myPointCut()
    {

    }
}