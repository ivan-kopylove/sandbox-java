package com.github.ivan.kopylove.challenges.a5d4cb74e6d44885ab52af8fdda754fd;

class Main
{
    public static void main(String[] args) throws InterruptedException
    {
        MyRunnable t1 = new MyRunnable("one");
        MyRunnable t2 = new MyRunnable("two");
        MyRunnable t3 = new MyRunnable("three");

        t1.getThread()
          .join();
        t2.getThread()
          .join();
        t3.getThread()
          .join();

        System.out.println("main thread point");
    }
}