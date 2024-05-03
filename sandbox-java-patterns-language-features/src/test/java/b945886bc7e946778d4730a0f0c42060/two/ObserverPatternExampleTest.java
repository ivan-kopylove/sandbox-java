package com.github.ivan.kopylove.challenges.b945886bc7e946778d4730a0f0c42060.two;

import org.junit.jupiter.api.Test;

/**
 * https://stackoverflow.com/questions/6270132/create-a-custom-event-in-java
 * facets:
 * - listener
 * - patterns
 */
class ObserverPatternExampleTest
{
    @Test
    void run()
    {
        com.github.ivan.kopylove.challenges.b945886bc7e946778d4730a0f0c42060.two.Initiater initiater = new com.github.ivan.kopylove.challenges.b945886bc7e946778d4730a0f0c42060.two.Initiater();
        com.github.ivan.kopylove.challenges.b945886bc7e946778d4730a0f0c42060.two.Responder responder = new com.github.ivan.kopylove.challenges.b945886bc7e946778d4730a0f0c42060.two.Responder();

        initiater.addListener(responder);

        initiater.sayHello();  // Prints "Hello!!!" and "Hello there..."
    }
}