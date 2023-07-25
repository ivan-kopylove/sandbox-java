package com.github.ivan.kopylove.grpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class BasicExampleTest
{
    @Before
    public void run() throws IOException
    {
        Server server = ServerBuilder.forPort(8080)
                                     .addService(new HelloServiceImpl())
                                     .build();

        server.start();
    }

    @Test
    public void base()
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