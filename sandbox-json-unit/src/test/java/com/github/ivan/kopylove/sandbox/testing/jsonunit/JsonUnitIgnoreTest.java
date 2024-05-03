package com.github.ivan.kopylove.sandbox.testing.jsonunit;

import org.junit.jupiter.api.Test;

import static net.javacrumbs.jsonunit.assertj.JsonAssertions.assertThatJson;

class JsonUnitIgnoreTest
{
    @Test
    void test_dollar_syntax()
    {
        assertThatJson("{\"a\":1}").isEqualTo("{\"a\":\"${json-unit.ignore}\"}");
        assertThatJson("{\"a\":1}").isEqualTo("{\"a\":\"#{json-unit.ignore}\"}");
    }

    @Test
    void test_hash_syntax()
    {
        assertThatJson("{\"a\":1}").isEqualTo("{\"a\":\"#{json-unit.ignore}\"}");
    }
}
