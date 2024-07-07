package com.github.ivan.kopylove;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static com.github.ivan.kopylove.Constant.HELLO_1;
import static com.github.ivan.kopylove.Constant.HELLO_2;
import static com.github.ivan.kopylove.Constant.HELLO_3;
import static com.github.ivan.kopylove.Constant.HELLO_4;

@Service
public class CommandHandler
{
    public List<String> handle(Command command)
    {
        List<String> answer = new ArrayList<>();
        switch (command)
        {
            case START ->
            {
                answer.add(HELLO_1);
                answer.add(HELLO_2);
                answer.add(HELLO_3);
                answer.add(HELLO_4);
            }
        }
        return answer;
    }
}
