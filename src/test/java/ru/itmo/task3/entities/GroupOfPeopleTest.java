package ru.itmo.task3.entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.itmo.task3.enums.Condition;
import ru.itmo.task3.enums.Gender;
import ru.itmo.task3.enums.Profession;
import ru.itmo.task3.enums.Sound;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class GroupOfPeopleTest {
    private Location a;
    private Location b;
    private GroupOfPeople programmers;
    private GroupOfPeople footmen;

    @BeforeEach
    public void init() {
        this.a = new Location("Локация А", "Некая локация за пределами сцены", Stream.of(Sound.SILENCE).collect(Collectors.toList()));
        this.b = new Location("Локация Б", "Основное место действия", Stream.of(Sound.SILENCE).collect(Collectors.toList()));

        Person programmer1 = new Person("first", 20, Gender.FEMALE, Profession.PROGRAMMER, a, Condition.NORMAL);
        Person footman1 = new Person("123", 20, Gender.MALE, Profession.FOOTMAN, b, Condition.STAND_BY_THE_DOOR);
        Person footman2 = new Person("321", 21, Gender.MALE, Profession.FOOTMAN, b, Condition.STAND_BY_THE_DOOR);


        this.programmers = new GroupOfPeople("ПРОГРАММИСТЫ");
        this.programmers.addPerson(programmer1);
        this.footmen = new GroupOfPeople("ЛАКЕИ");
        this.footmen.addPerson(footman1);
        this.footmen.addPerson(footman2);
    }

    @Test
    @DisplayName("Test group break into")
    public void breakIntoTest() {
        System.out.println("Локация была: "
                + programmers.getPeople().getFirst().getLocation().getName());

        programmers.breakInto(b);

        System.out.println("Локация стала: "
                + programmers.getPeople().getFirst().getLocation().getName());

        assertEquals(b.getName(), programmers.getPeople().getFirst().getLocation().getName());
    }

    @Test
    @DisplayName("Test set unknown sound")
    void setIncorrectAgeTest() {
        Exception exception = assertThrows(RuntimeException.class, () -> programmers.makeSound(a, Stream.of(Sound.NOTHING).collect(Collectors.toList())));
        String expectedMessage = "звук NOTHING - Не найден";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
    
    @Test
    @DisplayName("Test set condition")
    void setConditionTest() {
        Condition expectedCondition = Condition.SHAKEN;

        programmers.shakePeople(footmen);

        assertEquals(expectedCondition, footmen.getPeople().getFirst().getCondition());
    }
}