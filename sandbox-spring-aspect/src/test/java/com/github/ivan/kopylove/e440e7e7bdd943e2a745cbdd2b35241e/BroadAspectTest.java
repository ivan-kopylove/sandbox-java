package com.github.ivan.kopylove.e440e7e7bdd943e2a745cbdd2b35241e;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import static com.github.ivan.kopylove.e440e7e7bdd943e2a745cbdd2b35241e.AspectConfig.CALLED_TYPES;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;

/**
 * A basic example just to check if Spring context is safe and sound.
 */
@ExtendWith(SpringExtension.class)
@ContextConfiguration(loader = AnnotationConfigContextLoader.class, classes = {AppConfig.class})
class BroadAspectTest
{
    @Autowired
    private SomeSpringComponent2 someSpringComponent;


    @Test
    void runExample()
    {
        assertThat(someSpringComponent.bar(), equalTo(1));
        assertThat(CALLED_TYPES, contains(SomeSpringComponent2.class.getSimpleName()));
    }
}
