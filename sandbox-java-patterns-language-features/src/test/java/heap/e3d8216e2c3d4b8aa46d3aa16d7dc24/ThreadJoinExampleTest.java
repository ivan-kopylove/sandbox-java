package heap.e3d8216e2c3d4b8aa46d3aa16d7dc24;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @see <a href="https://ivan-kopylove.github.io/e3d8216e-2c3d-4b8a-a46d-3aa16d7dc24">blog</a>
 * @see <a href="obsidian://search/?vault=notes&query=e3d8216e-2c3d-4b8a-a46d-3aa16d7dc24">obsidian</a>
 */
class ThreadJoinExampleTest
{
        @Test
        @DisplayName("VolatileTest way to demonstrate that .join operation blocks the execution")
        void should_print_one_by_one_ascending() throws InterruptedException
        {
            for(int i = 0; i < 10; i++)
            {
                int a = i;
                Thread thread = new Thread(() -> {
                    System.out.println(a);
                    try
                    {
                        Thread.sleep(500);
                    }
                    catch (InterruptedException e)
                    {
                        throw new RuntimeException(e);
                    }
                });
//                thread.join(); // try to uncomment the call
                thread.start();
                thread.join(); // try to comment the call
            }

            System.out.println("main thread");
    }
}