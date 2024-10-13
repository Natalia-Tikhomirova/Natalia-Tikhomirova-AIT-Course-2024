package homework_22.arrayMethods;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class Array1Test {

    Array1 array1;
    int[] array = {65, 37, 51, -17, 73, -41, 52, 56, -55, 83};

    @BeforeEach
    void setUp() {

        array1 = new Array1(array);
    }

    @Test
    void sumOfElementsOddIndexes() {
        int expected = 37 + (-17) + (-41) + 56 + 83;
        System.out.println(" Sum of all elements with odd indexes: " + expected);
        int actual = array1.sumOfElementsOddIndexes();
        assertEquals(expected, actual,"Sum of all elements with odd indexes is not correct: ");
    }

    @Test
    void fifthElement() {
        int expected = 73;
        System.out.println("Fifth element = " + expected);
        int actual = array1.fifthElement();
        assertEquals(expected,actual, "Fifth element is not correct = ");

    }
} // end of class