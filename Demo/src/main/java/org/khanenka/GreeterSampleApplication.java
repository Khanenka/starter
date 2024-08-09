package org.khanenka;

import org.khanenka.properties.Greeter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class GreeterSampleApplication implements CommandLineRunner {


    private Greeter greeter;
    @Autowired
    public GreeterSampleApplication(Greeter greeter) {
        this.greeter = greeter;
    }

    public static void main(String[] args) {
        SpringApplication.run(GreeterSampleApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        LocalDateTime specificDateTime = LocalDateTime.of(2024, 7, 8, 14, 30);
        String message = greeter.greet(specificDateTime);
        System.out.println(message);
    }
}

