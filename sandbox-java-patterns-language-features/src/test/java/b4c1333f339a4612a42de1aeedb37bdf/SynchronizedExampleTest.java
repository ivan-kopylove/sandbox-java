package b4c1333f339a4612a42de1aeedb37bdf;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Facets:
 * - concurrency
 */
class SynchronizedExampleTest
{
    @Test
    void threadDangerousRun() throws InterruptedException
    {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        CounterThreadDangerous summation = new CounterThreadDangerous();

        IntStream.range(0, 1000)
                 .forEach(count -> executorService.submit(summation::calculate));
        executorService.awaitTermination(2000, TimeUnit.MILLISECONDS);

        assertTrue(summation.getSum() < 1000);
    }

    @Test
    void threadSafeRun() throws InterruptedException
    {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        CounterThreadSafe summation = new CounterThreadSafe();

        IntStream.range(0, 1000)
                 .forEach(count -> executorService.submit(summation::calculate));
        executorService.awaitTermination(2000, TimeUnit.MILLISECONDS);

        assertEquals(1000, summation.getSum());
    }

    @Test
    void threadSafeRun2() throws InterruptedException
    {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        CounterThreadSafeBlock summation = new CounterThreadSafeBlock();

        IntStream.range(0, 1000)
                 .forEach(count -> executorService.submit(summation::calculate));
        executorService.awaitTermination(2000, TimeUnit.MILLISECONDS);

        assertEquals(1000, summation.getSum());
    }

    class CounterThreadSafe
    {
        private int sum = 0;

        public synchronized void calculate()
        {
            setSum(getSum() + 1);
        }

        public int getSum()
        {
            return sum;
        }

        public void setSum(int sum)
        {
            this.sum = sum;
        }
    }

    class CounterThreadSafeBlock
    {
        private int sum = 0;

        public void calculate()
        {
            synchronized (this)
            {
                setSum(getSum() + 1);
            }
        }

        public int getSum()
        {
            return sum;
        }

        public void setSum(int sum)
        {
            this.sum = sum;
        }
    }

    /**
     *
     */
    class CounterThreadDangerous
    {
        private int sum = 0;

        public void calculate()
        {
            setSum(getSum() + 1);
        }

        public int getSum()
        {
            return sum;
        }

        public void setSum(int sum)
        {
            this.sum = sum;
        }
    }
}