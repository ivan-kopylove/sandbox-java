package heap.c3719e171f9c42ee80a04de5053c3ef7;

import org.junit.jupiter.api.Test;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

class CompletableFutureSupplyAsyncTest {

    @Test
    void exception() {
        CompletableFuture<String> stringCompletableFuture = CompletableFuture.supplyAsync(() -> {
            throw new RuntimeException("hello");
        });
        assertThrows(RuntimeException.class, () -> {
            try {
                stringCompletableFuture.get();
            } catch (ExecutionException e) {
                throw e.getCause();
            }
        });
    }

    @Test
    void return_value() throws ExecutionException, InterruptedException {
        CompletableFuture<String> stringCompletableFuture = CompletableFuture.supplyAsync(() -> "world");

        fail("try to predict yourself before running the assertion");
        assertThat(stringCompletableFuture.get(), equalTo("world"));
    }
}
