package ru.itmo.task3.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ru.itmo.task3.enums.Sound;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Location {
    private String name;
    private String purpose;
    private List<Sound> sounds;
}
