package com.example.personapp.reactive.api;

import com.example.personapp.reactive.boundary.PersonService;
import com.example.personapp.reactive.dataaccess.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class PersonRestController {

    private final PersonService personService;

    public PersonRestController(PersonService personService) {
        this.personService = personService;
    }

    @RequestMapping("/persons")
    @GetMapping
    public Flux<Person> findAll() {
        return personService.findAll();
    }

    @RequestMapping("/hello")
    @GetMapping
    public Mono<String> sayHello() {
        return Mono.just("hello").map(String::toUpperCase);
    }

}
