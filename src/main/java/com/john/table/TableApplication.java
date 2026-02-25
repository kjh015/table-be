package com.john.table;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class TableApplication {

    public static void main(String[] args) {
        SpringApplication.run(TableApplication.class, args);
    }
}
