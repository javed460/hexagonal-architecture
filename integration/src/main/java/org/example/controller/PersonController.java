package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.domain.Person;
import org.example.dto.PersonDTO;
import org.example.service.PersonService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.example.transformer.PersonTransformer.transformFromPersonDTO;

@RestController
@RequestMapping("/person")
@RequiredArgsConstructor
public class PersonController {
    private final PersonService personService;

    @PostMapping
    public Long createPerson(@RequestBody PersonDTO personDTO) {
        Person person = transformFromPersonDTO(personDTO);
        return personService.createPerson(person);
    }
}
