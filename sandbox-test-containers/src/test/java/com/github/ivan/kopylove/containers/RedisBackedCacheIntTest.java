package com.github.ivan.kopylove.containers;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.testcontainers.utility.DockerImageName;

@Testcontainers
public class RedisBackedCacheIntTest
{
    @Container
    public static GenericContainer redis = new GenericContainer(DockerImageName.parse("redis:5.0.3-alpine")).withExposedPorts(
            6379);

    @BeforeAll
    public static void setUp()
    {

        redis.start();
    }

    @AfterAll
    public static void tearDown()
    {
        redis.stop();
    }

    @Test
    public void run()
    {

    }
}
