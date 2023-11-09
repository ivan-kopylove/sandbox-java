package com.github.ivan.kopylove.websocket;

import com.github.ivan.kopylove.sanbox.java.websocket.ChatClientEndpoint;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.testcontainers.utility.DockerImageName;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

@Testcontainers
class SharedContainerExampleTest
{
    private static final Logger LOGGER = LogManager.getLogger(SharedContainerExampleTest.class);

    @Container
    public static  GenericContainer sharedContainer = new GenericContainer(DockerImageName.parse("jmalloc/echo-server")).withExposedPorts(
            8080);
    private static Integer          externalPort;

    @BeforeAll
    public static void setUp()
    {

        sharedContainer.start();
        externalPort = sharedContainer.getFirstMappedPort();
    }

    @AfterAll
    public static void tearDown()
    {
        sharedContainer.stop();
    }

    @Test
    void main() throws URISyntaxException, InterruptedException
    {
        List<String> result = new ArrayList<>();
        CountDownLatch lock = new CountDownLatch(1);


        ChatClientEndpoint clientEndPoint = new ChatClientEndpoint(new URI("wss://localhost:" + externalPort));
        clientEndPoint.addMessageHandler(new ChatClientEndpoint.MessageHandler()
        {
            public void handleMessage(String message)
            {
                result.add(message);
                lock.countDown();
            }
        });


        clientEndPoint.sendMessage("my test message");

        if (lock.await(5, SECONDS))
        {
            assertThat(result.size(), equalTo(1));
        }
        else
        {
            Assertions.fail();
        }
    }
}
