package org.example.config;

import org.example.port.PersonPort;
import org.example.service.PersonService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public PersonService personService (PersonPort personPort) {
        return new PersonService(personPort);
    }
}
