package com.github.ivan.kopylove.containers;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.testcontainers.utility.DockerImageName;

import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

@Testcontainers
class SharedContainerExampleTest
{
    @Container
    public static GenericContainer sharedContainer = new GenericContainer(DockerImageName.parse("redis:5.0.3-alpine")).withExposedPorts(
            6379);

    @BeforeAll
    public static void setUp()
    {

        sharedContainer.start();
    }

    @AfterAll
    public static void tearDown()
    {
        sharedContainer.stop();
    }

    @Test
    void run()
    {
        assertThat(sharedContainer.isRunning(), equalTo(true));
        assertThat(sharedContainer.getHost(), equalTo("localhost"));

        assertThat(sharedContainer.getExposedPorts(), equalTo(List.of(6379)));
    }
}
