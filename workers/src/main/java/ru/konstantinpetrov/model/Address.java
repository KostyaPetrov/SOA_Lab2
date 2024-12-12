package ru.konstantinpetrov.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    private String street; //Длина строки не должна быть больше 71, Поле может быть null
    private Location town; //Поле не может быть null
}
