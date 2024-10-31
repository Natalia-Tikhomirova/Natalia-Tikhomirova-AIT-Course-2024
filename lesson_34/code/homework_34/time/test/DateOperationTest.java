package homework_34.time.test;

import homework_34.time.utils.DateOperation;
import homework_34.time.utils.DateOperation1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DateOperationTest {

    @Test
    void getAge() {
        assertEquals(63, DateOperation1.getAge("12/04/1961"));
        assertEquals(62, DateOperation1.getAge("1961-11-28"));
    }

    @Test
    void sortStringDates() {
        String[] dates = {"2000-12-01", "10/12/2000", "1970-08-12", "2010-10-05"};
        String[] actual = DateOperation1.sortStringDates(dates);
        String[] expected = {"1970-08-12", "2000-12-01", "10/12/2000", "2010-10-05"};
        assertArrayEquals(expected, actual);
    }
} // end of class