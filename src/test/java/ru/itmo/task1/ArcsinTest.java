package ru.itmo.task1;

import java.util.Random;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ArcsinTest {
    private final Random random = new Random();
    private final double epsilon = 0.055;

    @Test
    @DisplayName("check zero")
    public void checkZeroValue() {
        Assertions.assertEquals(Math.asin(0), Arcsin.asin(0), epsilon);
    }

    @ParameterizedTest
    @ValueSource(doubles = {-0.85, -0.90, -0.95})
    @DisplayName("check negative values close to -1")
    public void checkNegativeCloseToOneValues(double value) {
        Assertions.assertEquals(Math.asin(value), Arcsin.asin(value), epsilon);
    }

    @ParameterizedTest
    @ValueSource(doubles = {0.85, 0.90, 0.95})
    @DisplayName("check positive values close to 1")
    public void checkPositiveCloseToOneValues(double value) {
        Assertions.assertEquals(Math.asin(value), Arcsin.asin(value), epsilon);
    }

    @ParameterizedTest
    @ValueSource(doubles = {-0.35, -0.45, -0.55})
    @DisplayName("check negative values in between")
    public void checkNegativeValues(double value) {
        Assertions.assertEquals(Math.asin(value), Arcsin.asin(value), epsilon);
    }

    @ParameterizedTest
    @ValueSource(doubles = {0.35, 0.45, 0.55})
    @DisplayName("check positive values in between")
    public void checkPositiveValues(double value) {
        Assertions.assertEquals(Math.asin(value), Arcsin.asin(value), epsilon);
    }

    @ParameterizedTest
    @ValueSource(doubles = {-0.10, -0.05, -0.01})
    @DisplayName("check negative values close to 0")
    public void checkNegativeCloseToZeroValues(double value) {
        Assertions.assertEquals(Math.asin(value), Arcsin.asin(value), epsilon);
    }

    @Test
    @DisplayName("check NaN value")
    public void checkNanValue() {
        Assertions.assertEquals(Math.asin(Double.NaN), Arcsin.asin(Double.NaN), epsilon);
    }

    @ParameterizedTest
    @ValueSource(doubles = {-1.5, 2.5})
    @DisplayName("check values out of range")
    public void checkOutOfRangeValues(double value) {
        Assertions.assertEquals(Math.asin(value), Arcsin.asin(value), epsilon);
    }
}
