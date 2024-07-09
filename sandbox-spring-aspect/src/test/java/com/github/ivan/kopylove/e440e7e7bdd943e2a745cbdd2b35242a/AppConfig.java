package com.github.ivan.kopylove.e440e7e7bdd943e2a745cbdd2b35242a;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.ArrayList;

@Configuration
@ComponentScan(basePackages = "com.github.ivan.kopylove.e440e7e7bdd943e2a745cbdd2b35242a")
@EnableAspectJAutoProxy
class AppConfig
{
    @Bean
    VerificationContainer verificationContainer()
    {
        return new VerificationContainer(new ArrayList<>());
    }
}
