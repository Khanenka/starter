package org.khanenka.controller;

import org.khanenka.properties.Greeter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class GreetController {
    private final Greeter greeter;

    @Autowired
    public GreetController(Greeter greeter) {
        this.greeter = greeter;
    }

    @GetMapping("/greet")
    public String hello() {
        return greeter.greet();
    }
}
