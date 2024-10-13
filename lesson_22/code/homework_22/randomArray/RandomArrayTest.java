package homework_22.randomArray;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomArrayTest {

  RandomArray  randomArray;

    @BeforeEach
    void setUp() {
        randomArray = new RandomArray();
        randomArray.fillArray();
    }

    @Test
    void countPositive() {
        int positiveCount = randomArray.countPositive();
        System.out.println( "Count of positive numbers: " + positiveCount);
        assertTrue(positiveCount >= 0 && positiveCount <= 100, "The numbers of positive must be between 0 and 100" );
    }

    @Test
    void countNegative() {
        int negativeCount = randomArray.countNegative();
        System.out.println("Count of negative numbers: " + negativeCount);
        assertTrue(negativeCount  >= 0 && negativeCount <= 100,"The numbers of negative must be between 0 and 100");
    }

    @Test
    void countEven() {
        int evenCount = randomArray.countEven();
        System.out.println("Count of even numbers: " + evenCount);
        assertTrue(evenCount  >= 0 && evenCount <= 100,"The numbers of even must be between 0 and 100");
    }

    @Test
    void countZero() {
        int zeroCount = randomArray.countZero();
        System.out.println("Count of even numbers: " + zeroCount);
        assertTrue( zeroCount >= 0 && zeroCount <= 100, "The numbers of zero must be between 0 and 100");
    }

    @Test
    void sumOfCounts() {
        int totalCount = randomArray.sumOfCounts();
        System.out.println("The sum of all numbers: " + totalCount);
        assertEquals(100,totalCount,"The sum of all numbers must be equal to 100");
    }
} // end of class