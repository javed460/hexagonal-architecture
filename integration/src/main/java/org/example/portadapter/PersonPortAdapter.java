package org.example.portadapter;

import lombok.RequiredArgsConstructor;
import org.example.domain.Person;
import org.example.port.PersonPort;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PersonPortAdapter implements PersonPort {

    @Override
    public Long createPerson(Person person) {
        return null;
    }

    @Override
    public Person getPerson(String id) {
        return null;
    }

    @Override
    public Person updatePerson(Person person) {
        return null;
    }
}
