package homework_30;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
// 1. Получить число без тире:
// - извлечь символы (substring) и преобразовать в целое число (Integer.parseInt)
// 2. Сравнить:
// - по году
// - по месяцу
// - по дню.

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DateSortTest {

    Comparator<String> comparator;

    @BeforeEach
    void setUp() {
        comparator = (s1, s2) -> {
            // TODO Homework

            // 1-я строка п.1
            int day1 = Integer.parseInt(s1.substring(0,2));
            int month1 = Integer.parseInt(s1.substring(3,5));
            int year1 = Integer.parseInt(s1.substring(6,10));

            // 2-я строка п.1
            int day2 = Integer.parseInt(s2.substring(0,2));
            int month2 = Integer.parseInt(s2.substring(3,5));
            int year2 = Integer.parseInt(s2.substring(6,10));

            // п.2
            // int res = Integer.compare(year1,year2);
            // return res != 0 ? res : (month1 != month2? Integer.compare(month1,month2) : Integer.compare(day1,day2) );

            int res = (year1 != year2) ? Integer.compare(year1, year2) : (month1 != month2) ? Integer.compare(month1, month2) : Integer.compare(day1, day2);
            return res;
        };
    }

    @Test
    void testDateSort() {
        String[] dates = {
                "07-05-1990",
                "28-01-2010",
                "11-08-1990",
                "15-01-2010",
                "16-06-1970"
        };
        String[] expected = {
                "16-06-1970",
                "07-05-1990",
                "11-08-1990",
                "15-01-2010",
                "28-01-2010"
        };
        Arrays.sort(dates, comparator);
        assertArrayEquals(expected, dates);
    }
} // end of class

