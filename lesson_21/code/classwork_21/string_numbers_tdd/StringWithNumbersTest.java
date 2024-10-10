package classwork_21.string_numbers_tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringWithNumbersTest {

    StringWithNumbers stringWithNumbers; // object для тестирования

    @BeforeEach
    void setUp() {
        stringWithNumbers = new StringWithNumbers("123 321 10"); // 454
    }

    @Test
    void sumOfNumbersInStringTest(){  // mini maid

       // StringWithNumbers.sumOfNumbersInString() // можно так по имени класса, но убираем static

        String str = "123 321 10"; // придумали строку и обработали в методе
        int expected = 454;
        int actual = stringWithNumbers.sumOfNumbersInString(str); //  результат actual
        assertEquals(expected,actual); // метод из библиотеки: сравнивает ожидаемое и актуальное
    }

}