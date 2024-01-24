package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineParameterizedTests {

    Feline feline = new Feline();
    private final int expectedResult;
    private final int actualResult;

    public FelineParameterizedTests(int expectedResult, int actualResult) {
        this.expectedResult = expectedResult;
        this.actualResult = actualResult;
    }

    @Parameterized.Parameters (name = "Тестовые данные: {0}, {1}")
    public static Object[][] getTestData() {
        return new Object[][]{
                {0, 0},
                {1, 1},
                {10, 10},
        };
    }
    @Test
    public void kittensTest () {
        assertEquals("Неверное количество котят",
                expectedResult, feline.getKittens(actualResult));
    }
}
