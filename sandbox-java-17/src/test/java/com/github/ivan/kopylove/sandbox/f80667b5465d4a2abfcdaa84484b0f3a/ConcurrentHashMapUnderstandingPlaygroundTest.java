package com.github.ivan.kopylove.sandbox.f80667b5465d4a2abfcdaa84484b0f3a;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

import static java.util.concurrent.Executors.newFixedThreadPool;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.jupiter.api.Assertions.fail;

class ConcurrentHashMapUnderstandingPlaygroundTest {

    @Test
    void should_save_all_keys_under_high_load() throws InterruptedException {
        ConcurrentHashMap<String, String> collector = new ConcurrentHashMap<>();

        ExecutorService executorService = newFixedThreadPool(200);

        int loops = 1_000_000;
        for (int i = 0; i < loops; i++) {
            executorService.submit(() -> {
                collector.put(UUID.randomUUID().toString(), UUID.randomUUID().toString());
            });
        }
        Thread.sleep(15_000);

        fail("try to predict yourself before running the assertion");
        assertThat(collector.size(), equalTo(loops));
    }

    @Test
    void should_miss_some_keys() throws InterruptedException {
        Map<String, String> collector = new HashMap<>();

        ExecutorService executorService = newFixedThreadPool(200);

        int loops = 1_000_000;
        for (int i = 0; i < loops; i++) {
            executorService.submit(() -> {
                collector.put(UUID.randomUUID().toString(), UUID.randomUUID().toString());
            });
        }
        Thread.sleep(15_000);

        fail("try to predict yourself before running the assertion");
        assertThat(collector.size(), greaterThan(loops / 10));
        assertThat(collector.size(), lessThan(loops));
    }
}
