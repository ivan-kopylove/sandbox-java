package com.github.ivan.kopylove.e6437f67669b4a35b435057e44da6404;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * A basic example just to check if Spring context is safe and sound.
 */
@ExtendWith(SpringExtension.class)
@ContextConfiguration(loader = AnnotationConfigContextLoader.class, classes = {AppConfig.class})
class SpringContextBasicExampleTest
{
    @Autowired
    private SomeSpringComponent1 someSpringComponent;

    @Test
    void basic_example()
    {
        assertThat(someSpringComponent.bar(), equalTo(1));
    }
}
