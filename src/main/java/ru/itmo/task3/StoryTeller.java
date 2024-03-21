package ru.itmo.task3;

import ru.itmo.task3.entities.Door;
import ru.itmo.task3.entities.GroupOfPeople;
import ru.itmo.task3.entities.Location;
import ru.itmo.task3.entities.Person;
import ru.itmo.task3.enums.Condition;
import ru.itmo.task3.enums.Gender;
import ru.itmo.task3.enums.Profession;
import ru.itmo.task3.enums.Sound;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StoryTeller {
    public void makeStory() {
        Location firstRoom = new Location(
                "ПЕРВАЯ КОМНАТА",
                "Некая комната за пределами главной",
                Stream.of(Sound.SILENCE).collect(Collectors.toList())
        );

        Location secondRoom = new Location(
                "ВТОРАЯ КОМНАТА",
                "Комната с лакеями",
                Stream.of(Sound.SILENCE).collect(Collectors.toList())
        );

        Person Phuc = new Person(
                "Фук",
                25,
                Gender.MALE,
                Profession.PROGRAMMER,
                firstRoom,
                Condition.ANGRY
        );

        Person Lancville = new Person(
                "Ланквилл",
                25,
                Gender.MALE,
                Profession.PROGRAMMER,
                firstRoom,
                Condition.ANGRY
        );

        Person footman1 = new Person(
                "Бебебе",
                20,
                Gender.MALE,
                Profession.FOOTMAN,
                secondRoom,
                Condition.STAND_BY_THE_DOOR
        );

        Person footman2 = new Person(
                "Бубубу",
                30,
                Gender.MALE,
                Profession.FOOTMAN,
                secondRoom,
                Condition.STAND_BY_THE_DOOR
        );

        GroupOfPeople programmers = new GroupOfPeople("ПРОГРАММИСТЫ");
        programmers.addPerson(Phuc);
        programmers.addPerson(Lancville);

        GroupOfPeople footmen = new GroupOfPeople("ЛАКЕИ");
        footmen.addPerson(footman1);
        footmen.addPerson(footman2);

        Door door = new Door(false);

        programmers.makeSound(firstRoom, Stream.of(Sound.NOISE, Sound.SCREAM).collect(Collectors.toList()));
        programmers.makeSound(secondRoom, Stream.of(Sound.NOISE, Sound.SCREAM).collect(Collectors.toList()));

        door.open();
        programmers.breakInto(secondRoom);

        programmers.shakePeople(footmen);
    }
}
