package heap.ad57cce4610d45198362140e9facf32c;

// Example 1: Basic Illegal Monitor State (Run to see error)

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * @see <a href="obsidian://search/?vault=notes&query=ad57cce4">obsidian</a>
 * @see <a href="https://ivan-kopylove.github.io/ad57cce4-610d-4519-8362-140e9facf32c">blog</a>
 */
public class WaitErrorExampleTest {

    @Nested
    class Problem
    {
        @Test
        void should_throw_because_monitor_is_not_locked() throws InterruptedException
        {
            // given
            Object lock = new Object();

            // when
            IllegalMonitorStateException ex = assertThrows(IllegalMonitorStateException.class, () -> {
                lock.wait(); // ← This will throw exception
            });


            // then
            assertThat(ex.getMessage(), equalTo("current thread is not owner"));
        }
    }

    @Nested
    class Solution
    {
        @Test
        void should_call_wait_normally() throws InterruptedException
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