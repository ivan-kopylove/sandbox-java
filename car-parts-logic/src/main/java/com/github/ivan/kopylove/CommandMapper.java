package com.github.ivan.kopylove;

import org.springframework.stereotype.Service;

import static com.github.ivan.kopylove.Command.UNKNOWN;

@Service
public class CommandMapper
{

    public Command mapCommand(String command)
    {
        if (command.startsWith("/start"))
        {
            return Command.START;
        }
        return UNKNOWN;
    }
}
