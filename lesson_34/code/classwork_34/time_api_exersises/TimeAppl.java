package classwork_34.time_api_exersises;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class TimeAppl {

    public static void main(String[] args) {

        //How much time? -ISO format: YYYY-mm-DD

        LocalDate ld = LocalDate.now();
        System.out.println(ld);

        LocalTime lt = LocalTime.now();
        System.out.println(lt);

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        System.out.println("___________________________________________________________");

        LocalDate gagarin = LocalDate.of(1961,04,12);
        System.out.println(gagarin); // ISO

        // Какой это был день недели?
        System.out.println(gagarin.getDayOfWeek());

        // Какой это был день года?
        System.out.println(gagarin.getDayOfYear());

        System.out.println("_______________________________Is leap year?__________________________");
        int year = 2024;
        System.out.println("Is year " + year + "leap: " + Year.isLeap(year));

        System.out.println("___________________________________________________________");
        System.out.println(gagarin.isBefore(ld)); // true
        System.out.println(gagarin.isAfter(ld)); // false
        System.out.println("___________________________________________________________");
        //LocalDate days = LocalDate.ofEpochDay(ChronoUnit.DAYS.between(gagarin,ld));
        //System.out.println(days);

        long period = ChronoUnit.DAYS.between(gagarin,ld);
        System.out.println(period);

        System.out.println("_____________DateTimeFormatter_______________________");
        DateTimeFormatter df = DateTimeFormatter.ISO_LOCAL_DATE; // YYYY-mm-DD
        String date = gagarin.format(df); // LocalDate to String
        System.out.println(date);

        // Выбираем другой формат
        df = DateTimeFormatter.BASIC_ISO_DATE;
        date = gagarin.format(df);
        System.out.println(date);

        // задаем другой, собственный формат строки с датой

        System.out.println("___________________________________________________________");
        df = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // делаем разные форматы
        date = gagarin.format(df);
        System.out.println(date);

        // задаем другой, собственный формат строки с датой
        System.out.println("___________________________________________________________");
        df = DateTimeFormatter.ofPattern("dd/MMMM/YYYY");
        date = gagarin.format(df);
        System.out.println(date);

        // задаем locale
        df = DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.GERMANY);
        date = gagarin.format(df);
        System.out.println(date);

        // parsing localDate from String
        System.out.println("/////////////////////////////////////////////////////////////");
        String stringDate = "29:02-2023";
        LocalDate result = LocalDate.parse(stringDate,DateTimeFormatter.ofPattern("[dd:MM:yyyy][dd/MM//yyyy][dd-MM-yyy][dd:MM-yyyy]"));
        System.out.println(result); // ISO format

        System.out.println("______________________________________________________________");
        String dianaBirthday = "23.06.1983";
        LocalDate dianaBirthd = LocalDate.parse(dianaBirthday,DateTimeFormatter.ofPattern("[dd.MM.yyyy]"));
        System.out.println(dianaBirthd);
        df = DateTimeFormatter.ofPattern("dd.MMMM.yyyy",Locale.FRANCE);
        String d = dianaBirthd.format(df);
        System.out.println(d);




    } // end of main

} // end of class
