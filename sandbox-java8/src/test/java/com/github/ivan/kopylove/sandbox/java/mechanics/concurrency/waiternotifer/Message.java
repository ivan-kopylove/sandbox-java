package com.github.ivan.kopylove.sandbox.java.mechanics.concurrency.waiternotifer;

public class Message
{
    private String msg;

    public Message(final String msg)
    {
        this.msg = msg;
    }

    public String getMsg()
    {
        return msg;
    }

    public void setMsg(final String msg)
    {
        this.msg = msg;
    }
}
