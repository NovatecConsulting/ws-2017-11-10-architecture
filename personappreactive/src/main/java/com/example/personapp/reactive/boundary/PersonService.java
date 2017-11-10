package com.example.personapp.reactive.boundary;

import com.example.personapp.reactive.dataaccess.Person;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PersonService {

    Flux<Person> findAll();

    Mono<Person> findPersonByLastName(String lastName);

}
