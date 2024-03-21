package ru.itmo.task3.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Door {
    private boolean isOpen;

    public void open() {
        isOpen = true;
    }

    public void close() {
        isOpen = false;
    }
}
