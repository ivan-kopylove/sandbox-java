package com.github.ivan.kopylove.sandbox.java.mechanics.concurrency.threadYield;

import org.junit.jupiter.api.Test;

/**
 * Examples from Eckel's book.
 *
 * @author Ivan Kopylov
 */
public class BasicThreads
{
    @Test
    public void main()
    {
        Thread t = new Thread(new LiftOff());
        t.start();
        System.out.println("Waiting for LiftOff");
    }
}
