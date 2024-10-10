package classwork_21.arrays_tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTddTest {

    ArrayTdd arrayTdd; // декларируем объект на базе класса ArrayTdd
    int [] array = {10,-10,20,-15,45,23,46}; // перенесли массив сюда и ниже его объявлять не нужно

    @BeforeEach
    void setUp() {
        //int [] array = {10,-10,20,-15,45}; // перенесли вверх
        arrayTdd = new ArrayTdd(array);   // возьми конструктор, написанный ранее
    }

    @Test
    void countPositive() {
        //int [] array = {10,-10,20,-15,45}; 3 полож. числа // перенесли вверх
       // expected
        int expected = 5; // ожидаемое

       // actual
        int actual = arrayTdd.countPositive(array);// актуальное значение
        assertEquals(expected,actual,"Bad info: ");

    }
} // end of class