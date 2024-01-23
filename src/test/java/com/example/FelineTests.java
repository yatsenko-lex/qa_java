package com.example;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTests {

    @Test
    public void eatMeatFelineTest() throws Exception {
        Feline feline = new Feline();
        List<String> expectedEatMeat = Arrays.asList("Животные", "Птицы", "Рыба");
        List<String> actualEatMeat = feline.getFood("Хищник");
        assertEquals(expectedEatMeat, actualEatMeat);
    }

    @Test
    public void familyFelineTest() {
        Feline feline = new Feline();
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void kittensCountFelineTest() {
        Feline feline = new Feline();
        assertEquals(1, feline.getKittens());
    }

}
