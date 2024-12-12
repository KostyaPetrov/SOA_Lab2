package ru.konstantinpetrov.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Location {
    private Double x; //Поле не может быть null
    private long y;
    private int z;
}
