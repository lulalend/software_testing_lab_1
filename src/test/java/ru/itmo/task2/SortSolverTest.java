package ru.itmo.task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortSolverTest {

    @Test
    void selectionSort() {
        int[] array = {1, 2, 4, 5, 3};
        int[] expectedArray = {1, 2, 3, 4, 5};
        int[] resultArray = SortSolver.selectionSort(array);

        Assertions.assertArrayEquals(expectedArray, resultArray);
    }

}