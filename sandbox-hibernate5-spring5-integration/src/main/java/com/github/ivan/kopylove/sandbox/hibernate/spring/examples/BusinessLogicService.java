package com.github.ivan.kopylove.sandbox.hibernate.spring.examples;

import com.github.ivan.kopylove.sandbox.hibernate.spring.entities.ParentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Business logic container.
 */
@Service
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
class BusinessLogicService
{
    @Autowired
    private DocumentLoader documentLoader;

    public String runLogic(String name)
    {
        List<ParentEntity> parents = documentLoader.load(name);
        return parents.stream()
                      .map(ParentEntity::getName)
                      .collect(Collectors.joining(", "));
    }
}
