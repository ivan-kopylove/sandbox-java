package com.github.ivan.kopylove.challenges.c71c2953b8214a87a702fd1d5b80f32b;

import org.junit.jupiter.api.Test;

/**
 * https://www.journaldev.com/1037/java-thread-wait-notify-and-notifyall-example
 */
class WaiterNotifierTest
{
    @Test
    void run() throws InterruptedException
    {
        com.github.ivan.kopylove.challenges.c71c2953b8214a87a702fd1d5b80f32b.Message msg = new com.github.ivan.kopylove.challenges.c71c2953b8214a87a702fd1d5b80f32b.Message("process it");
        com.github.ivan.kopylove.challenges.c71c2953b8214a87a702fd1d5b80f32b.Waiter waiter = new com.github.ivan.kopylove.challenges.c71c2953b8214a87a702fd1d5b80f32b.Waiter(msg);
        new Thread(waiter, "waiter").start();

        com.github.ivan.kopylove.challenges.c71c2953b8214a87a702fd1d5b80f32b.Waiter waiter1 = new com.github.ivan.kopylove.challenges.c71c2953b8214a87a702fd1d5b80f32b.Waiter(msg);
        new Thread(waiter1, "waiter1").start();

        com.github.ivan.kopylove.challenges.c71c2953b8214a87a702fd1d5b80f32b.Notifier notifier = new com.github.ivan.kopylove.challenges.c71c2953b8214a87a702fd1d5b80f32b.Notifier(msg);
        new Thread(notifier, "notifier").start();

        Thread.sleep(5000);
        System.out.println("All the threads are started");
    }
}
