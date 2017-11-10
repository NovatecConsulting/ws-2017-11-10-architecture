package com.example.personapp.boundary;

import com.example.personapp.dataaccess.Person;
import com.example.personapp.dataaccess.PersonRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;

    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public List<Person> findAll() {
        return personRepository.findAll();
    }

    @Override
    public Person findByLastName(String lastName) {
        return personRepository.findPersonByLastName(lastName);
    }
}
