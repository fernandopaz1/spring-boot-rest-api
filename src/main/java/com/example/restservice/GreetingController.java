package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "world") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

}

// GreetingController es la clase que se encarga de definir los metodos que responden a la llamada a la api
// estos metodos tienen la anotation @GetMapping y dentro la url de la llamada que responden
// esta funcion retorna un nuevo objeto Greetings cuyos parametros son controlados por las variables
// de la clase GreetingController

// para convertir  a json spring-boot utliza la clase MappingJackson2HttpMessageConverter 
