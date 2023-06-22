package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    private Feline feline;

    @Test
    public void checkGetSound() {
        Cat cat = new Cat(feline);
        String expectedResult = "Мяу";
        String actualResult = cat.getSound();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void checkGetFood() throws Exception {
        Cat cat = new Cat(feline);
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actualResult = cat.getFood();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), actualResult);
    }
}