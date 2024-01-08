package org.example.port;

import org.example.domain.Person;

public interface PersonPort {

    Long createPerson(Person person);

    Person getPerson(String id);

    Person updatePerson(Person person);

}
