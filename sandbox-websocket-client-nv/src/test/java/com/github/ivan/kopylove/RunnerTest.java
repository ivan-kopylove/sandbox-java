package com.github.ivan.kopylove;

import com.neovisionaries.ws.client.WebSocketException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class RunnerTest
{

    private static final Logger LOGGER = LogManager.getLogger(RunnerTest.class);

    @Test
    @Disabled
    public void testMain() throws WebSocketException, IOException
    {
        //        WebSocket socket = new WebSocketFactory().createSocket("wss://echo.websocket.org");
        //        socket.addListener(new MyDebugWebsocketAdapter());
        //
        //        socket.connect();
        //        socket.sendText("hi");
    }
}