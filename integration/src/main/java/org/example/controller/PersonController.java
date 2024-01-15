package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.domain.Person;
import org.example.dto.PersonDTO;
import org.example.service.PersonService;
import org.springframework.web.bind.annotation.*;

import static org.example.transformer.PersonTransformer.transformFromPerson;
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

    @GetMapping("{id}")
    public PersonDTO getPerson(@PathVariable("id") String id) {
        Person person = personService.getPerson(id);
        return transformFromPerson(person);
    }

    @PutMapping("{id}")
    public PersonDTO updatePerson(@PathVariable("id") String id, @RequestBody PersonDTO personDTO) {
        Person person = transformFromPersonDTO(personDTO);
        person.setId(Long.parseLong(id));
        Person updatedPerson = personService.updatePerson(person);
        return transformFromPerson(updatedPerson);
    }
}
