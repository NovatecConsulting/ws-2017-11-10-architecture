package com.example.personapp.reactive.boundary;

import com.example.personapp.reactive.dataaccess.Person;
import com.example.personapp.reactive.dataaccess.PersonRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;

    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public Flux<Person> findAll() {
        return personRepository.findAll();
    }

    @Override
    public Mono<Person> findPersonByLastName(String lastName) {
        return personRepository.findPersonByLastName(lastName);
    }
}
