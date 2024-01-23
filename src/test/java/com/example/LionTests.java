package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

@RunWith(MockitoJUnitRunner.class)
public class LionTests {

    @Mock
    Lion lion;
    @Mock
    Feline feline;

    @Test
    public void correctSexTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Assert.assertTrue(lion.doesHaveMane());
    }

    @Test
    public void hasManeTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Assert.assertTrue(lion.doesHaveMane());
    }

    @Test
    public void doesNotHasManeTest() throws Exception {
        Lion lion = new Lion("Самка", feline);
        Assert.assertFalse(lion.doesHaveMane());
    }

    @Test
    public void invalidSexTest() {
        try {
            Lion lion = new Lion("QWE", feline);
            fail("Ожидалось исключение");
        } catch (Exception e) {
            assertEquals("Используйте допустимые значения пола животного - самей или самка", e.getMessage());
        }
    }

    @Test
    public void getKittensTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        assertEquals(0, lion.getKittens());
    }

    @Test
    public void lionEatMeatTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(Arrays.asList("Животные", "Птицы", "Рыба"));
        List<String> expectedEatMeat = Arrays.asList("Животные", "Птицы", "Рыба");
        List<String> actualEatMeat = lion.getFood();
        assertEquals(expectedEatMeat, actualEatMeat);
    }
}


