package heap;

// Example 1: Basic Illegal Monitor State (Run to see error)

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Documentation related:
 * <p>
 * <a href="obsidian://open?vault=notes&file=ad57cce4-610d-4519-8362-140e9facf32c%2Fad57cce4-610d-4519-8362-140e9facf32c">obsidian</a>
 * </p>
 * <a href="https://ivan-kopylove.github.io/ad57cce4-610d-4519-8362-140e9facf32c">blog</a>
 */
public class WaitErrorExampleTest {

    @Test
    void should_do_something_when_condition() throws InterruptedException {
        // given
        Object lock = new Object();

        // when
        IllegalMonitorStateException ex = assertThrows(IllegalMonitorStateException.class,
                         () -> {
                             lock.wait(); // ← This will throw exception
                         });


        // then
        assertThat(ex.getMessage(), equalTo("current thread is not owner"));
    }

    @Nested
    class Solution
    {
        @Test
        void should_do_something_when_condition() throws InterruptedException
        {
            // given
            Object lock = new Object();
            synchronized (lock) {
                System.out.println("Entered sync block");
                // when
                lock.wait();
                System.out.println("This never prints");
            }
        }
    }
}