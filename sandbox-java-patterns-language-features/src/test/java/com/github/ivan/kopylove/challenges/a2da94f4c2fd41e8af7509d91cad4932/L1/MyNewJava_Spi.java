package com.github.ivan.kopylove.challenges.a2da94f4c2fd41e8af7509d91cad4932.L1;


@FunctionalInterface
public interface MyNewJava_Spi {

    String callMe(Payload myPayload);

    record Payload(IllegalArgumentException myPayload) {
    }

}
