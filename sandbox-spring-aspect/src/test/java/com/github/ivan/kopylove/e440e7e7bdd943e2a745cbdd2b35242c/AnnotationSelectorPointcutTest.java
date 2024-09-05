package com.github.ivan.kopylove.e440e7e7bdd943e2a745cbdd2b35242c;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.not;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(loader = AnnotationConfigContextLoader.class, classes = {AppConfig.class})
class AnnotationSelectorPointcutTest
{
    @Autowired
    private MyAnnotationComponent someSpringComponent;

    @Autowired
    private NoAnnotationComponent noAnnotationComponent;

    @Autowired
    private VerificationContainer verificationContainer;

    @Test
    void runExample()
    {
        assertThat(noAnnotationComponent.call(), equalTo(1));
        assertThat(someSpringComponent.call(), equalTo(1));

        assertThat(verificationContainer.listCalled(), contains(MyAnnotationComponent.class.getSimpleName()));
        assertThat(verificationContainer.listCalled(), not(contains(NoAnnotationComponent.class.getSimpleName())));
    }
}
