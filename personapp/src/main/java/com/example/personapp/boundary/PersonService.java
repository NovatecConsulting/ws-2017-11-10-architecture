package com.example.personapp.boundary;

import com.example.personapp.dataaccess.Person;

import java.util.List;

public interface PersonService {

    List<Person> findAll();

    Person findByLastName(String lastName);

}
