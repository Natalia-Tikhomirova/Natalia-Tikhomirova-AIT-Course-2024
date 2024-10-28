package homework_33.week_day;

// Задать ENUM weekDay - дни недели. Опробовать на нем методы: .values() .toString .ordinal() .valueOf()
//
//Реализуйте метод, позволяющий прибавлять дни к выбранному дню недели, получая правильный день недели.


public class WeekDayAppl {
    public static void main(String[] args) {

        WeekDay [] weekDay = WeekDay.values();
        System.out.println("___________________values()_________________________");

        for (WeekDay day : weekDay) {
            System.out.println(day);
            System.out.println(day.getName());
            System.out.println(day.getType());
            System.out.println(day.getNumber());
        }

        System.out.println("_______________________________________________________________");
        for (int i = 0; i < weekDay.length; i++) {
            System.out.println(weekDay[i]);
            System.out.println(weekDay[i].getName() + " : " + weekDay[i].getType() + " : " + weekDay[i].getNumber());
            System.out.println("_______________________________________________________________");
            System.out.println(weekDay[i].getType());
            System.out.println("_______________________________________________________________");
            System.out.println(weekDay[i].getNumber());
            System.out.println("______________ordinal()_________________");
        }

        System.out.println("_____________________toString()________________________");

        WeekDay day = WeekDay.FRIDAY;
        System.out.println(day.toString()); // Friday

        System.out.println("______________ordinal()_________________");

        WeekDay day1 = WeekDay.FRIDAY;
        System.out.println(day1.ordinal()); // 4

        System.out.println("______________valueOf()_________________");

        WeekDay day2 = WeekDay.valueOf("FRIDAY");
        System.out.println(day2); //  Friday

        System.out.println("_______________________________________________________________");

        // Пример: Monday + 10 days = Thursday (понедельник + 10 дней = четверг)
        // Проверьте работу метода с помощью теста.

        WeekDay today = WeekDay.MONDAY;
        WeekDay newDay = today.plusDay(10);

        System.out.println("Today is: " + today);
        System.out.println("Day after 10 days is: " + newDay);


    } // end of main


} // end of class
