package org.example.portadapter;

import lombok.RequiredArgsConstructor;
import org.example.domain.Person;
import org.example.exception.PersonNotFoundException;
import org.example.port.PersonPort;
import org.example.repo.PersonRepository;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PersonPortAdapter implements PersonPort {

    private final PersonRepository personRepository;

    @Override
    public Long createPerson(Person person) {
        Person savedPerson = personRepository.save(person);
        return savedPerson.getId();
    }

    @Override
    public Person getPerson(String id) {
        return personRepository.findById(Long.parseLong(id))
                .orElseThrow(() -> new PersonNotFoundException(Long.parseLong(id)));
    }

    @Override
    public Person updatePerson(Person person) {
        return personRepository.save(person);
    }
}
