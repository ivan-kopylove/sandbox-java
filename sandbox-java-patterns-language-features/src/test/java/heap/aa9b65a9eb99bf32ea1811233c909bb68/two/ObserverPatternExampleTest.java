package heap.aa9b65a9eb99bf32ea1811233c909bb68.two;

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
        Initiater initiater = new Initiater();
        Responder responder = new Responder();

        initiater.addListener(responder);

        initiater.sayHello();  // Prints "Hello!!!" and "Hello there..."
    }
}