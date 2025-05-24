package heap.a7d5a520e5d2fe67754cea352f2ffba2e;

import org.junit.jupiter.api.Test;

class RunnableLambdaExampleTest
{
    /**
     * Java lambdas.
     * <p>
     * VolatileTest functional interface is an interface that contains only one abstract method
     * {@link Runnable}, ActionListener, Comparable are some of the examples of functional interfaces
     * <p>
     * VolatileTest lambda expression is composed of three parts.
     * Argument List  | Arrow	| 	Token Body
     * (int x, int y) | ->		|	x + y
     */

    @SuppressWarnings("Convert2Lambda")
    @Test
    void run()
    {
        Runnable r1 = new Runnable()
        {
            @Override
            public void run()
            {
                System.out.println("runnable 1");
            }
        };

        Runnable r2 = () -> System.out.println("runnable 2");
        r1.run();
        r2.run();
    }
}
