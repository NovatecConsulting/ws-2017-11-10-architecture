package com.example.personapp.reactive;

import com.example.personapp.reactive.dataaccess.Person;
import com.example.personapp.reactive.dataaccess.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    private final PersonRepository personRepository;

    public DataInitializer(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        personRepository.save(new Person("Max", "Mustermann")).subscribe();
        personRepository.save(new Person("Sabine", "Maier")).subscribe();
    }
}
