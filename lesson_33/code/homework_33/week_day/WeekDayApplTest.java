package homework_33.week_day;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeekDayApplTest {

    @Test
    void testPlusDay() {

        WeekDay today = WeekDay.MONDAY;
        WeekDay newDay = today.plusDay(10);

        assertEquals(WeekDay.THURSDAY, newDay);
        System.out.println(newDay);

        assertEquals(WeekDay.FRIDAY, WeekDay.THURSDAY.plusDay(1));
        assertEquals(WeekDay.SUNDAY, WeekDay.THURSDAY.plusDay(3));

    }


} // end of class