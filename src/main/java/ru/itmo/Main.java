package ru.itmo;

import ru.itmo.task2.SortSolver;
import ru.itmo.task3.StoryTeller;

public class Main {
    public static void main(String[] args) {

        try {
            StoryTeller we = new StoryTeller();
            we.makeStory();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }


    }
}