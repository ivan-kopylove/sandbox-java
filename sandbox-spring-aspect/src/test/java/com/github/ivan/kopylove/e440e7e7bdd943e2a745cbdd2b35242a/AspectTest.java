package com.github.ivan.kopylove.e440e7e7bdd943e2a745cbdd2b35242a;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(loader = AnnotationConfigContextLoader.class, classes = {AppConfig.class})
class AspectTest
{
    @Autowired
    private SomeSpringComponent4 someSpringComponent;

    @Autowired
    private VerificationContainer verificationContainer;

    @Test
    void runExample()
    {
        assertThat(someSpringComponent.bar(), equalTo(1));
        assertThat(verificationContainer.listCalled(), contains(SomeSpringComponent4.class.getSimpleName()));
    }
}
