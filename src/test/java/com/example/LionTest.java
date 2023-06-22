package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    private Feline feline;

    @Test
    public void checkGetKittens() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        int actualResult = lion.getKittens();
        assertEquals(1, actualResult);
    }

    @Test
    public void checkGetFood() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actualResult = lion.getFood();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), actualResult);
    }

    @Test
    public void checkExceptionHasMane() {
        Exception exception = assertThrows(Exception.class, () -> {
            Lion lion = new Lion("Что-то", feline);
            lion.doesHaveMane();
        });
        String expectedMessage = "Используйте допустимые значения пола животного - самей или самка";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }
}