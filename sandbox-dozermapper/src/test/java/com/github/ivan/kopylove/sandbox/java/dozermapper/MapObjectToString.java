package com.github.ivan.kopylove.sandbox.java.dozermapper;

import com.github.ivan.kopylove.sandbox.java.dozermapper.conf.DozerMapper;
import com.github.ivan.kopylove.sandbox.java.dozermapper.domain.case2.From;
import com.github.ivan.kopylove.sandbox.java.dozermapper.domain.case2.Inner;
import com.github.ivan.kopylove.sandbox.java.dozermapper.domain.case2.To;
import org.dozer.Mapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MapObjectToString
{
    private final Mapper MAPPER = DozerMapper.getInstance();

    @Test
    public void run()
    {
        Inner inner = new Inner();
        From from = new From();
        from.setInner(inner);

        To map = MAPPER.map(from, To.class);
        assertEquals(Inner.value, map.getReceiver());
    }
}
