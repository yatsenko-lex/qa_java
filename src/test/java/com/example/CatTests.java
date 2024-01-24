package com.example;

import org.hamcrest.MatcherAssert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTests {

    @Mock
    Feline feline;

    @Test
    public void soundIsCorrectTest() {
        String sound = "Мяу";
        MatcherAssert.assertThat("Неверный звук", new Cat(feline).getSound().equals(sound));
    }

    @Test
    public void foodIsCorrectTest() throws Exception {
        Cat cat = new Cat(feline);
        List<String> foodList = Arrays.asList("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(foodList);
        assertEquals(foodList, cat.getFood());
    }
}
