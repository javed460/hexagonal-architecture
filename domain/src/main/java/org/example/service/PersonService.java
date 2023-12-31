package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.domain.Person;
import org.example.port.PersonPort;

@RequiredArgsConstructor
public class PersonService {
    private final PersonPort personPort;

    public Long createPerson(Person person) {
        return personPort.createPerson(person);
    }

    public Person getPerson(String id) {
        return personPort.getPerson(id);
    }

    public Person updatePerson(Person person) {
        return personPort.updatePerson(person);
    }
}
