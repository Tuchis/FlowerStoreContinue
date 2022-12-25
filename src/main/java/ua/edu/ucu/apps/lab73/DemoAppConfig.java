package ua.edu.ucu.apps.lab73;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoAppConfig {
    @Bean
    public String getData(){
        return "Hello, world";
    }
}
