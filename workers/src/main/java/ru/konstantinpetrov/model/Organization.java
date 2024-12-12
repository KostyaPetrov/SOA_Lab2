package ru.konstantinpetrov.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Organization {
    private String fullName; //Поле может быть null
    private OrganizationType type; //Поле может быть null
    private Address postalAddress; //Поле может быть null
}
