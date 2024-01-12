package org.example.transformer;

import org.example.domain.Address;
import org.example.domain.Person;
import org.example.dto.AddressDTO;
import org.example.dto.PersonDTO;

public final class PersonTransformer {

    public static Person transformFromPersonDTO(PersonDTO personDTO) {
        Person person = new Person();
        person.setFirstName(personDTO.getFirstName());
        person.setLastName(personDTO.getLastName());
        person.setAddress(getAddress(personDTO.getAddressDTO()));
        return person;
    }

    public static PersonDTO transformFromPerson(Person person) {
        PersonDTO personDTO = new PersonDTO();
        personDTO.setFirstName(person.getFirstName());
        personDTO.setFirstName(person.getLastName());
        personDTO.setAddressDTO(getAddress(person.getAddress()));
        return personDTO;
    }

    private static AddressDTO getAddress(Address address) {
        AddressDTO addressDTO = new AddressDTO();
        addressDTO.setCity(address.getCity());
        addressDTO.setPincode(address.getPincode());
        addressDTO.setLine1(address.getLine1());
        addressDTO.setLine2(address.getLine2());
        return addressDTO;
    }

    private static Address getAddress(AddressDTO addressDTO) {
        Address address = new Address();
        address.setCity(addressDTO.getCity());
        address.setPincode(addressDTO.getPincode());
        address.setLine1(addressDTO.getLine1());
        address.setLine2(addressDTO.getLine2());
        return address;
    }
}
