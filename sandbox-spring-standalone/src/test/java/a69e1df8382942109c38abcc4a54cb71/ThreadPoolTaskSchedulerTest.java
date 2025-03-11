package a69e1df8382942109c38abcc4a54cb71;

import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.atomic.AtomicInteger;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.number.OrderingComparison.greaterThanOrEqualTo;

class ThreadPoolTaskSchedulerTest
{
    @Test
    void should_serve_as_hello_world_example_of_ThreadPoolTaskScheduler() throws InterruptedException
    {
        AtomicInteger result = new AtomicInteger(0);

        // given
        ThreadPoolTaskScheduler threadPoolTaskScheduler = new ThreadPoolTaskScheduler();
        threadPoolTaskScheduler.setPoolSize(1);
        threadPoolTaskScheduler.setThreadNamePrefix("ThreadPoolTaskScheduler");
        threadPoolTaskScheduler.initialize();

        // when

        threadPoolTaskScheduler.scheduleAtFixedRate(() -> result.incrementAndGet(),
                                                    Instant.now(),
                                                    Duration.ofSeconds(1));

        Thread.sleep(5_000);
        assertThat(result.get(), greaterThanOrEqualTo(5));
    }

    @Test
    @DisplayName("successive vs successful word in java doc for scheduleAtFixedRate")
    void should_run_job_further_even_when_exception() throws InterruptedException
    {
        AtomicInteger result = new AtomicInteger(0);

        // given
        ThreadPoolTaskScheduler threadPoolTaskScheduler = new ThreadPoolTaskScheduler();
        threadPoolTaskScheduler.setPoolSize(1);
        threadPoolTaskScheduler.setThreadNamePrefix("ThreadPoolTaskScheduler");
        threadPoolTaskScheduler.initialize();

        // when

        threadPoolTaskScheduler.scheduleAtFixedRate(() -> {
                                                        result.incrementAndGet();
            throw new RuntimeException("some exception");},
                                                    Instant.now(),
                                                    Duration.ofSeconds(1));

        Thread.sleep(5_000);
        assertThat(result.get(), greaterThanOrEqualTo(5));
    }

    @Nested
    class RenameMe
    {
        @Test
        @DisplayName("Should wait before running - again testing 'successive' word in the method javadoc")
        void should_wait_before_running_next() throws InterruptedException
        {
            AtomicInteger result = new AtomicInteger(0);

            // given
            ThreadPoolTaskScheduler threadPoolTaskScheduler = new ThreadPoolTaskScheduler();
            threadPoolTaskScheduler.setPoolSize(1);
            threadPoolTaskScheduler.setThreadNamePrefix("ThreadPoolTaskScheduler");
            threadPoolTaskScheduler.initialize();

            // when

            threadPoolTaskScheduler.scheduleAtFixedRate(() -> {
                                                            result.incrementAndGet();
                                                            waitLong();
                                                        },
                                                        Instant.now(),
                                                        Duration.ofSeconds(1));

            Thread.sleep(10_000);
            assertThat(result.get(), greaterThanOrEqualTo(1));
        }
    }

    private void waitLong()
    {
        try
        {
            Thread.sleep(60_000);
        }
        catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }
    }

}
