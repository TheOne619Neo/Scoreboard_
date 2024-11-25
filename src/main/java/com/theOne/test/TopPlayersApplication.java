package com.theOne.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * The main class for the Spring Boot application.
 */
@SpringBootApplication
public class TopPlayersApplication {

    public static void main(String[] args) {
        SpringApplication.run(TopPlayersApplication.class, args);
    }

    /**
     * Bean definition for the Scoreboard.
     * @return A new instance of Scoreboard.
     */
    @Bean
    public Scoreboard scoreboard() {
        return new Scoreboard();
    }
}
