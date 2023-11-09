package com.github.ivan.kopylove.grpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.equalTo;

class BasicExampleTest
{
    private Server server;

    @BeforeEach
    public void setup() throws IOException
    {
        server = ServerBuilder.forPort(8080)
                              .addService(new HelloServiceImpl())
                              .build();

        server.start();
    }

    @AfterEach
    public void destroy()
    {
        server.shutdown();
    }

    @Test
    void base()
    {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080)
                                                      .usePlaintext()
                                                      .build();

        HelloServiceGrpc.HelloServiceBlockingStub stub = HelloServiceGrpc.newBlockingStub(channel);

        HelloResponse helloResponse = stub.hello(HelloRequest.newBuilder()
                                                             .setFirstName("Ivan")
                                                             .setLastName("Kopylov")
                                                             .build());

        assertThat(helloResponse.getGreeting(), equalTo("Hello, Ivan Kopylov"));

        channel.shutdown();
    }
}