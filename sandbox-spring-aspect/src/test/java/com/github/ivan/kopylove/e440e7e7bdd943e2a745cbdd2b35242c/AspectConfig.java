package com.github.ivan.kopylove.e440e7e7bdd943e2a745cbdd2b35242c;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
class AspectConfig
{
    private final VerificationContainer verificationContainer;

    AspectConfig(VerificationContainer verificationContainer)
    {
        this.verificationContainer = verificationContainer;
    }

    @Before(value = "myPointCut()")
    void logBefore(JoinPoint joinPoint)
    {
        verificationContainer.listCalled()
                             .add(joinPoint.getSignature()
                                           .getDeclaringType()
                                           .getSimpleName());
    }

    @Pointcut("@annotation(com.github.ivan.kopylove.e440e7e7bdd943e2a745cbdd2b35242c.MyAnnotation)")
    void myPointCut()
    {

    }
}
