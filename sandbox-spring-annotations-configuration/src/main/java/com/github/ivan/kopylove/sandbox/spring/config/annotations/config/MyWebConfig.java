package com.github.ivan.kopylove.sandbox.spring.config.annotations.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.github.ivan.kopylove.sandbox.spring.config.annotations.components")
public class MyWebConfig
{}
