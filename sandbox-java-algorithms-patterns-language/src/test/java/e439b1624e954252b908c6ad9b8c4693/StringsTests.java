package com.github.ivan.kopylove.challenges.e439b1624e954252b908c6ad9b8c4693;

import org.junit.jupiter.api.Test;

import java.util.stream.Collectors;
import java.util.stream.Stream;

class StringsTests
{
    @Test
    void test()
    {

        Stream.of(new com.github.ivan.kopylove.challenges.e439b1624e954252b908c6ad9b8c4693.MyObj("a"), new com.github.ivan.kopylove.challenges.e439b1624e954252b908c6ad9b8c4693.MyObj("b"))
              .peek(o -> {
                  if (true)
                  {
                      o.setDasjlkdas("");
                  }
              })
              .collect(Collectors.toList());


        Stream.of(new com.github.ivan.kopylove.challenges.e439b1624e954252b908c6ad9b8c4693.MyObj("a"), new com.github.ivan.kopylove.challenges.e439b1624e954252b908c6ad9b8c4693.MyObj("b"))
              .filter(obj -> {
                  return true;
              })
              .collect(Collectors.toList());
    }
}
