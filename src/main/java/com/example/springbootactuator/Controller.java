package com.example.springbootactuator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping
    public String testActuator() {
        return "test Actuator ";
    }
}
