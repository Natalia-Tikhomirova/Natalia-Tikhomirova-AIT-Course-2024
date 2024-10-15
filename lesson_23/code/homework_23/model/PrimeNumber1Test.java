package homework_23.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumber1Test {

    private PrimeNumber1 primeNumber1;

    @BeforeEach
    void setUp() {
        primeNumber1 = new PrimeNumber1();
    }

    @Test
    void isPrimeNumberEdgeCaseTest() {
        assertFalse(PrimeNumber1.isPrimeNumber(1)); // Ожидаем false
    }

    @Test
    void isPrimeNumberPrimeTest() {
        assertTrue(PrimeNumber1.isPrimeNumber(2));  // 2 - простое

    }

    @Test
    void isPrimeNumberNonPrimeTest() {
        assertFalse(PrimeNumber1.isPrimeNumber(4));  // 4 - не простое
    }

} // end of class