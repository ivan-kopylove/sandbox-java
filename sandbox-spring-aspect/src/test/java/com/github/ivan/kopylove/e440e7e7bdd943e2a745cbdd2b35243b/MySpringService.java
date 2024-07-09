package com.github.ivan.kopylove.e440e7e7bdd943e2a745cbdd2b35243b;

import org.springframework.stereotype.Service;

@Service
@MyAnnotation
class MySpringService implements MyInterface
{
    public Integer call()
    {
        return 1;
    }
}
