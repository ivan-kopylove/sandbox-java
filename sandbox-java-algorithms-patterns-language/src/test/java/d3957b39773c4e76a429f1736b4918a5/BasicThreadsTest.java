package com.github.ivan.kopylove.challenges.d3957b39773c4e76a429f1736b4918a5;

import org.junit.jupiter.api.Test;

/**
 * java.mechanics.concurrency.threadYield
 * <p>
 * Examples from Eckel's book.
 */
class BasicThreadsTest
{
    @Test
    void main()
    {
        Thread t = new Thread(new com.github.ivan.kopylove.challenges.d3957b39773c4e76a429f1736b4918a5.LiftOff());
        t.start();
        System.out.println("Waiting for LiftOff");
    }
}
