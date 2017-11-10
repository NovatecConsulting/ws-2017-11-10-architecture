package com.example.personapp;

import com.example.personapp.dataaccess.Person;
import com.example.personapp.dataaccess.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    private final PersonRepository personRepository;

    public DataInitializer(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public void run(String... strings) throws Exception {
        Person max = new Person();
        max.setFirstName("Max");
        max.setLastName("Mustermann");

        personRepository.save(max);

        Person sabine = new Person();
        sabine.setFirstName("Sabine");
        sabine.setLastName("Maier");

        personRepository.save(sabine);
    }
}
