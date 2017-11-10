package com.example.personapp.reactive.dataaccess;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface PersonRepository extends ReactiveCrudRepository<Person, String> {

    Mono<Person> findPersonByLastName(String lastName);
}
