package ru.itmo.task3.entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import ru.itmo.task3.enums.Condition;
import ru.itmo.task3.enums.Sound;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class GroupOfPeople {
    private List<Person> people = new ArrayList<>();
    private String name;

    public GroupOfPeople(String name) {
        this.name = name;
    }

    public void addPerson(Person person) {
        people.add(person);
    }

    public void makeSound(Location location, List<Sound> sounds) {
        System.out.printf("В %s раздался/раздались ", location.getName());
        for (Sound sound : sounds) {
            switch (sound) {
                case SCREAM:
                    System.out.print("КРИК ");
                    break;
                case NOISE:
                    System.out.print("ШУМ ");
                    break;
                case SILENCE:
                    System.out.print("ТИШИНА ");
                    break;
                default:
                    throw new RuntimeException("звук " + sound + " - Не найден");
            }
        }
        System.out.println();

        location.setSounds(sounds);
    }

    public void shakePeople(GroupOfPeople shakenGroup) {
        System.out.printf("%s растолкали %s\n", this.name, shakenGroup.name);
        for (Person person: shakenGroup.getPeople()) {
            if (person.getCondition() == Condition.STAND_BY_THE_DOOR)
                person.setCondition(Condition.SHAKEN);
        }
    }

    public void breakInto(Location location) {
        System.out.printf("%s ворвались в %s\n", this.name, location.getName());

        for (Person person: this.getPeople()) {
            person.setLocation(location);
        }
    }
}
