package com.github.ivan.kopylove.sandbox.spring.statemachine;

import org.junit.jupiter.api.Test;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.statemachine.StateMachine;
import org.springframework.statemachine.config.StateMachineBuilder;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.stream.Collectors;

import static com.github.ivan.kopylove.sandbox.spring.statemachine.Events.EVENT_ONE;
import static com.github.ivan.kopylove.sandbox.spring.statemachine.States.END;
import static com.github.ivan.kopylove.sandbox.spring.statemachine.States.INITIAL;
import static com.github.ivan.kopylove.sandbox.spring.statemachine.States.INTERMEDIATE;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsNull.nullValue;

enum States
{
    INTERMEDIATE,
    INITIAL,
    END
}

enum Events
{
    EVENT_ONE,
    EVENT_TWO,
}

public class HelloControllerTest
{

    @Test
    public void basic_example() throws Exception
    {
        StateMachineBuilder.Builder<States, Events> builder = StateMachineBuilder.builder();

        builder.configureStates()
               .withStates()
               .initial(INITIAL)
               .end(END)
               .states(Arrays.stream(States.values())
                             .collect(Collectors.toSet()));

        builder.configureTransitions()
               .withExternal()
               .source(INITIAL)
               .target(INTERMEDIATE)
               .event(EVENT_ONE)
               .action(e -> System.out.println("action " + e));

        StateMachine<States, Events> stateMachine = builder.build();

        assertThat(stateMachine.getState(), nullValue());
        stateMachine.startReactively()
                    .block();
        assertThat(stateMachine.getState()
                               .getIds()
                               .stream()
                               .findFirst()
                               .get(), equalTo(INITIAL));

        stateMachine.sendEvent(Mono.just(MessageBuilder.withPayload(EVENT_ONE)
                                                       .build()))
                    .blockFirst();


        assertThat(stateMachine.getState()
                               .getIds()
                               .stream()
                               .findFirst()
                               .get(), equalTo(INTERMEDIATE));

        stateMachine.stopReactively()
                    .block();
    }
}