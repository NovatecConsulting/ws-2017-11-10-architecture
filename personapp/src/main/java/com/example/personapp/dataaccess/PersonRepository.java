package com.example.personapp.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {

    Person findPersonByLastName(String lastName);

}
