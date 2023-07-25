package com.github.lazyf1sh.sandbox.java.dozermapper.conf;

import com.github.lazyf1sh.sandbox.java.dozermapper.domain.case1.*;
import com.github.lazyf1sh.sandbox.java.dozermapper.domain.case2.From;
import com.github.lazyf1sh.sandbox.java.dozermapper.domain.case2.To;
import org.dozer.loader.api.BeanMappingBuilder;
import org.dozer.loader.api.TypeMappingOptions;

public class MapperConfiguration extends BeanMappingBuilder
{
    @Override
    protected void configure()
    {
        mapping(A.class, C.class).fields("key", "key");
        mapping(B.class, C.class).fields("key_a", "objA.key");
        mapping(E.class, D.class);

        mapping(From.class, To.class, TypeMappingOptions.wildcard(Boolean.FALSE)).fields("inner", "receiver");
    }
}
