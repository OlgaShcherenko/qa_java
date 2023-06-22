package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {

    private int numberKittens = 1;
    private int countKittens = 15;
    Feline feline = new Feline();

    @Test
    public void checkEatMeat() throws Exception {
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        List<String> actualResult = feline.eatMeat();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void checkGetFamily() {
        String expectedResult = "Кошачьи";
        String actualResult = feline.getFamily();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void checkGetKittens() {
        int expectedResult = numberKittens;
        int actualResult = feline.getKittens();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void checkGetKittensCount() {
        int expectedResult = countKittens;
        int actualResult = feline.getKittens(15);
        assertEquals(expectedResult, actualResult);
    }
}