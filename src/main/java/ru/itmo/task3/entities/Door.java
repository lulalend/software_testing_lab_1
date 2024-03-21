package ru.itmo.task3.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Door {
    private boolean isOpen;

    public void open() {
        System.out.println("Дверь открылась!");
        isOpen = true;
    }

    public void close() {
        System.out.println("Дверь закрылась!");
        isOpen = false;
    }
}
