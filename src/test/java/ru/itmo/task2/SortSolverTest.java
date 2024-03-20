package ru.itmo.task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortSolverTest {

    @Test
    @DisplayName(value = "empty array")
    void test1() {
        int[] array = {};
        int[] expectedArray = {};
        int[] resultArray = SortSolver.selectionSort(array);

        Assertions.assertArrayEquals(expectedArray, resultArray);
    }

    @Test
    @DisplayName(value = "array with one elem")
    void test2() {
        int[] array = {1};
        int[] expectedArray = {1};
        int[] resultArray = SortSolver.selectionSort(array);

        Assertions.assertArrayEquals(expectedArray, resultArray);
    }

    @Test
    @DisplayName(value = "array with identical elems")
    void test3() {
        int[] array = {0, 0, 0, -1, 1};
        int[] expectedArray = {-1, 0, 0, 0, 1};
        int[] resultArray = SortSolver.selectionSort(array);

        Assertions.assertArrayEquals(expectedArray, resultArray);
    }

    @Test
    @DisplayName(value = "in descending order")
    void test4() {
        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] expectedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] resultArray = SortSolver.selectionSort(array);

        Assertions.assertArrayEquals(expectedArray, resultArray);
    }

    @Test
    @DisplayName(value = "in ascending order")
    void test5() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] expectedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] resultArray = SortSolver.selectionSort(array);

        Assertions.assertArrayEquals(expectedArray, resultArray);
    }
}