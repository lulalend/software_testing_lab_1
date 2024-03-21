package ru.itmo.task3.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ru.itmo.task3.enums.Condition;
import ru.itmo.task3.enums.Gender;
import ru.itmo.task3.enums.Profession;

@Getter
@Setter
@AllArgsConstructor
public class Person {
    private String name;
    private int age;
    private Gender gender;
    private Profession profession;
    private Location location;
    private Condition condition;
}
