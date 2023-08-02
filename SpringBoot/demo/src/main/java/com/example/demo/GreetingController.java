package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class GreetingController {

    @GetMapping("/greetings")
    public List<String> getGreetings() {
        return Arrays.asList("Hello, world!", "Bonjour, le monde!", "Hola, mundo!", "Hallo, Welt!", "Ciao, mondo!");
    }
}
