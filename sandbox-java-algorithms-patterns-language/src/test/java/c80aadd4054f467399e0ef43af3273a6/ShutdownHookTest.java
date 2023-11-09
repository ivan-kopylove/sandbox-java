package c80aadd4054f467399e0ef43af3273a6;

import org.junit.jupiter.api.Test;

class ShutdownHookTest
{

    @Test
    void addHook()
    {
        System.out.println("Adding shut down hook.");
        Runtime.getRuntime()
               .addShutdownHook(new Thread()
               {
                   public void run()
                   {
                       System.out.println("Shutdown hook has executed.");
                       for (int i = 3; i > 0; i--)
                       {
                           try
                           {
                               System.out.println("shutdown in " + i);
                               Thread.sleep(1000);
                           }
                           catch (InterruptedException e)
                           {
                               e.printStackTrace();
                           }
                       }
                   }
               });
    }
}
