package homework_21;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayMinMaxTest {

    ArrayMinMax arrayMinMax;
    int[] array = { 75, 34, -15, -123, 57, -145, 86, 77, -145, 48, -59, -145 };

    @BeforeEach
    void setUp() {
       arrayMinMax = new ArrayMinMax(array);
    }

    @Test
    void minIndexOfArray() {
        int expectedMin = 5;
        int actualMin = arrayMinMax.MinIndexOfArray(array);
        assertEquals(expectedMin, actualMin);

    }

    @Test
    void maxIndexOfArray() {
        int expectedMax = 6;
        int actualMax = arrayMinMax.MaxIndexOfArray(array);
        assertEquals(expectedMax,actualMax);
    }

    @Test
    void minOfArray() {
        int expectedMin = -145;
        int actualMin = arrayMinMax.MinOfArray(array);
        assertEquals(expectedMin, actualMin);
    }

    @Test
    void maxOfArray() {
        int expectedMax = 86;
        int actualMax = arrayMinMax.MaxOfArray(array);
        assertEquals(expectedMax,actualMax);
    }
} // end of class