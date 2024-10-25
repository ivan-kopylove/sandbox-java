package ab81b92030881f732b1ff08b78bba6930;

import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

class ShutdownHookTest
{

    @Test
    void should_print_countdown_in_console()
    {
        AtomicBoolean executed = new AtomicBoolean(false);

        Runtime.getRuntime()
               .addShutdownHook(new Thread(new Runnable()
               {
                   @Override
                   public void run()
                   {
                       executed.set(true);

                       try
                       {
                           System.out.println("shutdown in " + 3);
                           Thread.sleep(1000);
                           System.out.println("shutdown in " + 2);
                           Thread.sleep(1000);
                           System.out.println("shutdown in " + 1);
                           Thread.sleep(1000);
                       }
                       catch (InterruptedException e)
                       {
                           e.printStackTrace();
                       }
                   }
               }));


        assertThat(executed.get(), equalTo(false)); // false because the hooks triggered after this line
    }
}
