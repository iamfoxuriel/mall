package com.rabears.config;

import com.rabears.dao.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CMDRunner {

    @Bean
    public CommandLineRunner runner(PersonRepository repository) {
        return args -> System.err.println(repository.findAll());
    }

}
