package heap.bda69669be1d454f907c1fcfaa167a33;

import org.junit.jupiter.api.Test;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import static org.junit.jupiter.api.Assertions.assertThrows;

class CompletableFutureRunAsyncTest
{

    @Test
    void exception()
    {
        CompletableFuture<Void> stringCompletableFuture = CompletableFuture.runAsync(() -> {
            throw new RuntimeException("hello");
        });
        assertThrows(RuntimeException.class, () -> {
            try
            {
                stringCompletableFuture.get();
            }
            catch (ExecutionException e)
            {
                throw e.getCause();
            }
        });
    }

}
