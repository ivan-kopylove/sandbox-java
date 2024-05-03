package com.github.ivan.kopylove.challenges.a5d4cb74e6d44885ab52af8fdda754fd;

class Main
{
    public static void main(String[] args) throws InterruptedException
    {
        com.github.ivan.kopylove.challenges.a5d4cb74e6d44885ab52af8fdda754fd.MyRunnable t1 = new com.github.ivan.kopylove.challenges.a5d4cb74e6d44885ab52af8fdda754fd.MyRunnable("one");
        com.github.ivan.kopylove.challenges.a5d4cb74e6d44885ab52af8fdda754fd.MyRunnable t2 = new com.github.ivan.kopylove.challenges.a5d4cb74e6d44885ab52af8fdda754fd.MyRunnable("two");
        com.github.ivan.kopylove.challenges.a5d4cb74e6d44885ab52af8fdda754fd.MyRunnable t3 = new com.github.ivan.kopylove.challenges.a5d4cb74e6d44885ab52af8fdda754fd.MyRunnable("three");

        t1.getThread()
          .join();
        t2.getThread()
          .join();
        t3.getThread()
          .join();

        System.out.println("main thread point");
    }
}