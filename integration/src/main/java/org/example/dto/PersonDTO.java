package org.example.dto;

import lombok.Data;

@Data
public class PersonDTO {
    private String firstName;
    private String lastName;
    private AddressDTO addressDTO;
}
