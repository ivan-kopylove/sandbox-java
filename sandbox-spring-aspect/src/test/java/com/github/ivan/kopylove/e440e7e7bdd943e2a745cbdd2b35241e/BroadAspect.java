package com.github.ivan.kopylove.e440e7e7bdd943e2a745cbdd2b35241e;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BroadAspect
{
    @Before(value = "myPointCut()")
    public void logBefore(JoinPoint joinPoint)
    {
        joinPoint.getArgs();
        System.out.println(joinPoint.getSignature()
                                    .getDeclaringTypeName() + "." + joinPoint.getSignature()
                                                                             .getName());
    }

    @Pointcut("execution(* *(..))")
    public void myPointCut()
    {
    }
}
