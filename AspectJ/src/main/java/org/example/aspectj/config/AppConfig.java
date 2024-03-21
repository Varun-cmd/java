package org.example.aspectj.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
@Component
@EnableAspectJAutoProxy

@ComponentScan("org.example.aspectj")
public class AppConfig{

}