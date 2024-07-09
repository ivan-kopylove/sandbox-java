package com.github.ivan.kopylove.e440e7e7bdd943e2a745cbdd2b35241f;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(loader = AnnotationConfigContextLoader.class, classes = {AppConfig.class})
class WithinAspectTest
{
    @Autowired
    private SomeSpringComponent3 someSpringComponent;

    @Test
    void basic_example()
    {
        assertThat(someSpringComponent.bar(), equalTo(1));
    }
}
